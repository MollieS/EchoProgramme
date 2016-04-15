package echo;

import echo.Console;

public class EchoConsole implements Console {

  public void output(String word) {
    System.out.println(word);
  }
}
