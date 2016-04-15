package echo;

import echo.Console;

public class TestConsole implements Console {

  private String stream;

  public void output(String word) {
    stream = word;
  }

  public String readOutput() {
    return stream;
  }
}
