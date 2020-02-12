package P2P;

import org.junit.Test;
import static org.junit.Assert.*;

public class indexServerTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}