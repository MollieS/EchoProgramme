package echo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import echo.Echo;
import echo.TestConsole;

public class EchoTest {
  
  @Test
  public void promptsUserInput() {
    TestConsole testConsole = new TestConsole();
    Echo echo = new Echo(testConsole);
    echo.promptInput();
    assertEquals(">", testConsole.readOutput());
  }
}
