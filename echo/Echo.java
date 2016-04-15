package echo;

public class Echo {

  private EchoConsole console;

  public Echo(EchoConsole console) {
    this.console = console;
  }

  public void promptInput() {
    console.output(">");
  }

}
