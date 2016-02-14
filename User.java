
// User class:
// - saves username, password, & top 10 high scores (unorganized)
// - saves as text file

import java.lang.*;
import java.util.*;
import java.io.*;

public class User {

  private String username;
  private String password;
  private Integer[] highScores;

  public User() {
    username = "";
    password = "";
    highScores = new Integer[10];
  }

  public User(String u, String p) {
    username = u;
    password = p;
    highScores = new Integer[10];
  }

  public User(String u, String p, Integer[] s) {
    username = u;
    password = p;
    highScores = s;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public Integer[] getHighScores() {
    return this.highScores;
  }

  public void addScore(Integer score) {
    for(int i = 0; i < this.highScores.length; i++) {
      if(this.highScores[i] == null) {
        this.highScores[i] = score;
        break;
      }
    }
  }

  // Takes in User and returns info of User to String
  public String userString(String s1, String s2) {
    String usernameString = this.username + s1;
    String passwordString = this.password + s1;
    String highScoresString = new String();

    for(int i = 0; i < this.highScores.length; i++) {
      if(this.highScores[i] == null) {
        break;
      }
      if(this.highScores[i+1] == null) {
        highScoresString += this.highScores[i].toString();
        break;
      }
      highScoresString += this.highScores[i].toString() + s2;
    }

    return usernameString + passwordString + highScoresString;
  }

  // Writes String s to path
  public void writeUser(String path, String s) {
    try {
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
      out.println(s);
      out.close();
    }
    catch(IOException e) {
    //exception handling left as an exercise for the reader
    }
  }

}
