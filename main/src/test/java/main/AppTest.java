package main;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * <<<<<<< HEAD
     * Test hello()
     */
    @Test
    public void testHello() {
        String test_result = "Hello World!";

        assertEquals("ERREUR", test_result, App.hello());
    }

    /*
     * Test hello(param)
     */
    @Test
    public void testHelloParam() {
        String test_result = "LALA";

        assertEquals("ERREUR", test_result, App.hello("LALA"));
    }
}
