package echo;

import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class EchoConsole {

  private PrintStream output;
  private BufferedReader input;

  public EchoConsole (InputStreamReader input, PrintStream output) {
    this.input = new BufferedReader(input);
    this.output = output;
  }

  public void output(String word) {
    output.println(word);
    String echo = "";
    try {
      echo = input.readLine();
    } catch(IOException e) {
      System.err.println(e.getMessage());
    } 
    output.println(echo);
  }

}
