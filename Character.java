
// Character class:
// - would take in index number (Unicode #, JIS #, etc.)
// - character itself
// - onyomi and kunyomi
// - English meaning
// - example words? + furigana reading

import java.util.*;

public class Character {

  public int indexNum;
  public String kanjiChar;
  public String onyomi;
  public String kunyomi;
  public String englishMean;
  public ArrayList<String> examples;

  public Character() {
    indexNum = 0;
    kanjiChar = "";
    onyomi = "";
    kunyomi = "";
    englishMean = "";
    examples = new ArrayList<String>();
  }

  public Character(int index, String kanji, String on, String kun, String en) {
    indexNum = index;
    kanjiChar = kanji;
    onyomi = on;
    kunyomi = kun;
    englishMean = en;
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

}
