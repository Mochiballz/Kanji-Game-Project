
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
    examples = new ArrayList();
  }

  public static void main (String [] args) {

  }

}
