package com.linkedin.javacodechallenges;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

  public void playGame() {

    Random random = new Random();
    int win = 10;
    boolean cont = true;
    Scanner scanner = new Scanner(System.in);
    while (cont){
    System.out.println("Do you want to play ? yes / no ");
    String str = scanner.nextLine();
    if (str.equals("no"))
    {
      System.out.println("your cuurent win is " + win);
      break;
    }
    if (str.equals("yes"))
    {
    if (random.nextInt(win) % 2 == 0){
      win *= 2;
      System.out.println("your cuurent win is " + win);
    }
    else {
      System.out.println("KO!!! you lost");
      break;
    }
  }
}
  }
}