package echo;

import java.io.PrintStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EchoConsole {

  private PrintStream output;
  private Scanner input;

  public EchoConsole (InputStreamReader input, PrintStream output) {
    this.input = new Scanner(input);
    this.output = output;
  }

  public void output(String word) {
    output.println(word);
  }

  public String readInput() {
    String echo = "";
    echo = input.nextLine();
    return echo;
  }

}
