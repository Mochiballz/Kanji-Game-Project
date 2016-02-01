
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
      String[] s = splitStringElem(array.get(i),":");
      Character c = new Character(i,s[0],s[1],s[2],s[3]);
      charList.add(c);
    }
    return charList;
  }

  public static void main(String[] args) {
    // Prints ArrayList<String> of INDEX.txt
    ArrayList<String> list = readFileToArrayList("INDEX.txt");
    ArrayList<Character> charList = toCharacterList(list);
    String[] s = splitStringElem(list.get(74),":");
    for(int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
    }
    System.out.println(charList.get(1));
  }

}
