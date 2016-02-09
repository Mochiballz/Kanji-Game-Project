
// User class:
// - saves username, password, & top 10 high scores (unorganized)
// - saves as text file

import java.lang.*;
import java.util.*;
import java.io.*;

public class User {

  private String username;
  private String password;
  private int[] highScores;

  public User() {
    username = "";
    password = "";
    highScores = new int[10];
  }

  public User(String u, String p) {
    username = u;
    password = p;
    highScores = new int[10];
  }

  public User(String u, String p, int[] s) {
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

  public int[] getHighScores() {
    return this.highScores;
  }

}
