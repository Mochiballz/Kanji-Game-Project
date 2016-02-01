
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

  public static void main(String[] args) {
    // Prints ArrayList<String> of INDEX.txt
    // System.out.println(readFileToArrayList("INDEX.txt"));
  }

}
