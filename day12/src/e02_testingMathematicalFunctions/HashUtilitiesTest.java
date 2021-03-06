package e02_testingMathematicalFunctions;

import maps.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
/**
 * JUnit test for class HashUtilities (Day 8, Exercise 5.1 - Hash function)
 */
public class HashUtilitiesTest {
    @Test
    public void testShortHash() {
       for(int n=-1000; n<1001; n++) {
           assertTrue("Error", (HashUtilities.shortHash(n) <= 1000 && HashUtilities.shortHash(n) >= 0));
       }
    }
}