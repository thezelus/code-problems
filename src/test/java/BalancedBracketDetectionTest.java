import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketDetectionTest {
    @Test
    public void testCheckBracketBalance() throws Exception {

        BalancedBracketDetection testBalancedBracketDetection = new BalancedBracketDetection();
        assertTrue(testBalancedBracketDetection.checkBracketBalance("()[]{}(([])){[()][]}"));
        assertFalse(testBalancedBracketDetection.checkBracketBalance("("));
        assertFalse(testBalancedBracketDetection.checkBracketBalance(")"));
        assertFalse(testBalancedBracketDetection.checkBracketBalance(")("));
        assertTrue(testBalancedBracketDetection.checkBracketBalance(""));
        assertFalse(testBalancedBracketDetection.checkBracketBalance(null));
    }
}
