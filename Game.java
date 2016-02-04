
import java.lang.*;
import java.util.*;
import java.io.*;

public class Game {

  // Takes file, turns lines to elements of ArrayList<String>
  public static ArrayList<String> readFileToArrayList(String file) {
    ArrayList<String> list = new ArrayList<String>();
    try {
      Scanner s = new Scanner(new File(file));
      while(s.hasNextLine()) {
        list.add(s.nextLine());
      }
      s.close();
    }
    catch(Exception e) {
      System.out.println(e.getMessage());
    }
    return list;
  }

  // Seperates element by colon to ArrayList<String>
  public static String[] splitStringElem(String s, String regex) {
    String[] array = s.split(regex);
    return array;
  }

  // Turns each element of ArrayList<String> into Character, makes Character list
  public static ArrayList<Character> toCharacterList(ArrayList<String> array) {
    ArrayList<Character> charList = new ArrayList<Character>();
    for(int i = 0; i < array.size(); i++) {
      String[] s = splitStringElem(array.get(i),"\\:+");
      charList.add(new Character(i+1,s[0],s[1],s[2],s[3]));
    }
    return charList;
  }

  public static void main(String[] args) {
    // Prints ArrayList<Character> from INDEX.txt
    ArrayList<String> list = readFileToArrayList("INDEX.txt");
    ArrayList<Character> charList = toCharacterList(list);
    for(int i = 0; i < charList.size(); i++) {
      Character c = charList.get(i);
      System.out.println(c.indexNum + " "
        + c.kanjiChar + " "
        + c.onyomi + " "
        + c.kunyomi + " "
        + c.englishMean);
    }
  }

}
