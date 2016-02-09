
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

  public int getIndex() {
    return this.indexNum;
  }

  public String getKanji() {
    return this.kanjiChar;
  }

  public String getOnyomi() {
    return this.onyomi;
  }

  public String getKunyomi() {
    return this.kunyomi;
  }

  public String getEnglish() {
    return this.englishMean;
  }

  public ArrayList<String> getExamples() {
    return this.examples;
  }

}
