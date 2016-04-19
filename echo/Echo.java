package echo;

public class Echo {

  private EchoConsole console;
  private String input = "";

  public Echo(EchoConsole console) {
    this.console = console;
  }

  public void promptInput() {
    console.output("(type quit to exit) >");
  }

  private void repeatInput() {
    promptInput();
    this.input = console.readInput();
    console.output(this.input);
  }

  public void echo() {
    while (!this.input.contains("quit")) {
      repeatInput();
    }
    console.output("thanks for playing");
  }
}
