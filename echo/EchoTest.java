package echo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.io.*;

import echo.Echo;

public class EchoTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayInputStream inContent = new ByteArrayInputStream("Hello".getBytes());

  @Before
  public void setUp() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void reset() {
    System.setOut(null);
  }

  @Test
  public void asksForInput() {
    Echo echo = new Echo();
    echo.askForInput();
    String output = new String(outContent.toByteArray());
    assertTrue(output.contains(">"));
  }

  @Test
  public void returnsInput() {
    System.setIn(inContent);
    Echo echo = new Echo();
    echo.echo();
    String output = new String(outContent.toByteArray());
    assertTrue(output.contains("Hello"));
  }
}
