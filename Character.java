
// Character class:
// - would take in index number (Unicode #, JIS #, etc.)
// - character itself
// - onyomi and kunyomi
// - English meaning
// - example words? + furigana reading

import java.util.*;

public class Character {

  private int indexNum;
  private String kanjiChar;
  private String onyomi;
  private String kunyomi;
  private String englishMean;
  private ArrayList<String> examples;

  public Character() {
    indexNum = 0;
    kanjiChar = "";
    onyomi = "";
    kunyomi = "";
    englishMean = "";
    examples = new ArrayList<String>();
  }

  public Character(int index, String kanji, String on, String kun, String en, ArrayList<String> ex) {
    indexNum = index;
    kanjiChar = kanji;
    onyomi = on;
    kunyomi = kun;
    englishMean = en;
    examples = ex;
  }

  public static void main (String [] args) {
    ArrayList<String> hiExamples = new ArrayList<String>();
    hiExamples.add("毎日");
    hiExamples.add("昨日");

    Character hi = new Character(312,"日","","にち","day",hiExamples);
    System.out.println(hi.kanjiChar);

    for(int i = 0; i < hi.examples.size(); i++){
      System.out.println(hi.examples.get(i));
    }
  }

}
