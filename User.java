
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

}
