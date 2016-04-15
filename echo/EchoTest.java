package echo;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

import echo.Echo;

public class EchoTest {
  
  @Test
  public void promptsUserInput() {
    TestConsole testConsole = new TestConsole();
    Echo echo = new Echo(testConsole);
    echo.promptInput();
    assertEquals(">", testConsole.output());
  }
}
