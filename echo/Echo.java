package echo;

import java.util.Scanner;

public class Echo {

  public static void main(String[] args) {
    askForInput();
    echo();
  }

  public static void askForInput() {
    System.out.println(">");
  }

  public static void echo() {
    Scanner scanner = new Scanner(System.in);
    String output = scanner.next();
    System.out.println(output);
  }
}
