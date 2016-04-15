package echo;

public class Echo {

  private Console console;

  public Echo(Console console) {
    this.console = console;
  }

  public void promptInput() {
    console.output(">");
  }
}
