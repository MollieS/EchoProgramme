package echo;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import echo.Echo;
import echo.EchoConsole;
import java.io.*;

public class EchoTest {

  private ByteArrayInputStream breakInput;
  private InputStreamReader inStream;
  private ByteArrayOutputStream output;
  private PrintStream outStream;
  private EchoConsole testConsole;
  private Echo echo;

  @Before
  public void setUp() {
    breakInput = new ByteArrayInputStream("Hello, World!\nquit".getBytes());
    inStream = new InputStreamReader(breakInput);
    output = new ByteArrayOutputStream();
    outStream = new PrintStream(output);
    testConsole = new EchoConsole(inStream, outStream);
    echo = new Echo(testConsole);
  }
  
  @Test
  public void asksForUserInput() {
    echo.promptInput();
    assertThat(output.toString(), containsString(">"));
  }

  @Test
  public void returnsInputStringToUser() {
    echo.echo();
    assertThat(output.toString(), containsString("Hello, World!"));
  }

  @Test
  public void echosUntilQuit() {
    echo.echo();
    assertThat(output.toString(), containsString(">\nHello, World!"));
    assertThat(output.toString(), containsString(">\nquit"));
    assertThat(output.toString(), containsString("thanks for playing"));
  }
}
