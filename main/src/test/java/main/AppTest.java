package main;

import static org.junit.Assert.assertEquals;
import main.App;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Test hello(param)
     */
    @Test
    public void testHelloParam() {
        String test_result = "LALA";

        assertEquals("ERREUR", test_result, App.hello("LALA"));
    }
}
