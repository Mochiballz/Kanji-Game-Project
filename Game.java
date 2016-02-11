
import java.lang.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;

public class Game {

  // Variables
  private ArrayList<Character> currentKanji;
  private ArrayList<Character> usedKanji;
  private int score;

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

  // Picks random Character from ArrayList<Character>, returns it
  public static Character pickRandCharacter(ArrayList<Character> c){
    Random rand = new Random();
    int i = rand.nextInt(c.size());
    return c.get(i);
  }

  // Returns true if c1 and c2 are the same Character
  public static boolean isSameCharacter(Character c1, Character c2) {
    if(c1 == c2) { return true; } return false;
  }

  // Creates a selection of random Characters to choose from in Character[]
  public static Character[] characterSelection(ArrayList<Character> charList, int init) {
    Character[] selection = new Character[init];

    for(int i = 0; i < init; i++) {
      Character c = pickRandCharacter(charList);
      selection[i] = c;
    }

    return selection;
  }

  public static int givePoints(Character correct, Character clicked, int points) {
    if(isSameCharacter(correct, clicked)) {
      return points;
    }
    return 0;
  }

  public static void main(String[] args) {
    // Prints ArrayList<Character> from INDEX.txt
    ArrayList<String> list = readFileToArrayList("INDEX.txt");
    ArrayList<Character> charList = toCharacterList(list);
    Character[] charArray = characterSelection(charList,9);
    for(int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i].getIndex());
    }
  }

}
