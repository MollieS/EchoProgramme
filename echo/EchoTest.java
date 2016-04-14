package echo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.*;

import echo.Echo;

public class EchoTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Test
  public void asksForInput() {
    System.setOut(new PrintStream(outContent));
    Echo echo = new Echo();
    echo.askForInput();
    System.setOut(null);
    String output = new String(outContent.toByteArray());
    assertTrue(output.contains(">"));
  }
}
