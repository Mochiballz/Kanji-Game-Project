
import java.lang.*;
import java.util.*;
import java.io.*;

public class Game {

  // Variables
  private Character prompt;
  private Character[] currentKanji;
  private ArrayList<Character> usedKanji;
  private Integer score;

  // Constructor
  public Game(Character[] charArray) {
    prompt = null;
    currentKanji = charArray;
    usedKanji = new ArrayList<Character>();
    score = 0;
  }

  public Character getPrompt() {
    return this.prompt;
  }

  public Character[] getCurrentKanji() {
    return this.currentKanji;
  }

  public ArrayList<Character> getUsedKanji() {
    return this.usedKanji;
  }

  public Integer getScore() {
    return this.score;
  }

  public void setPrompt() {
    Random rand = new Random();
    int i = rand.nextInt(this.currentKanji.length);
    prompt = this.currentKanji[i];
  }

  public void addUsedKanji(Character c) {
    this.usedKanji.add(c);
  }

  public void replaceCurrentKanji(int i, Character newChar) {
    this.currentKanji[i] = newChar;
  }

  public void addPoints(Integer points) {
    this.score += points;
  }

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

  public static void main(String[] args) {
    // Prints ArrayList<Character> from INDEX.txt
    ArrayList<String> indexList = readFileToArrayList("INDEX.txt");
    ArrayList<String> usersList = readFileToArrayList("USERS.txt");

    ArrayList<Character> charList = toCharacterList(indexList);
    Character[] charArray = characterSelection(charList,9);
    for(int i = 0; i < charArray.length; i++) {
      System.out.println(charArray[i].getIndex());
    }

    User aaron = new User("aaron","secret");
    aaron.addScore(3000);
    aaron.addScore(4500);
    aaron.addScore(234);

    String userInfo = aaron.userString(":",",");
    aaron.writeUser("USERS.txt",userInfo);

  }

}
