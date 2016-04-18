package echo;

import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    EchoConsole console = new EchoConsole(new InputStreamReader(System.in), System.out);
    Echo echo = new Echo(console);
    echo.echo();
  }
}
