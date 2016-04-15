package echo;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import echo.Echo;
import echo.EchoConsole;
import java.io.*;

public class EchoTest {
  
  @Test
  public void asksForUserInput() {
    ByteArrayInputStream input = new ByteArrayInputStream("\n".getBytes());
    InputStreamReader inStream = new InputStreamReader(input);

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    PrintStream outStream = new PrintStream(output);
    EchoConsole testConsole = new EchoConsole(inStream, outStream);
    Echo echo = new Echo(testConsole);
    echo.promptInput();
    assertThat(output.toString(), containsString(">"));
  }

  @Test
  public void returnsInputStringToUser() {
    ByteArrayInputStream input = new ByteArrayInputStream("Hello, World!\n".getBytes());
    InputStreamReader inStream = new InputStreamReader(input);

    ByteArrayOutputStream output = new ByteArrayOutputStream();
    PrintStream outStream = new PrintStream(output);

    EchoConsole testConsole = new EchoConsole(inStream, outStream);
    Echo echo = new Echo(testConsole);
    echo.promptInput();
    assertThat(output.toString(), containsString("Hello, World!"));
  }
}
