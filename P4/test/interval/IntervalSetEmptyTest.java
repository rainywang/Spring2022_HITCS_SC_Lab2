package interval;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.Collections;


/**
 * Tests for static methods of IntervalSet.
 * 
 * To facilitate testing multiple implementations of IntervalSet, instance methods are
 * tested in IntervalSetTest.
 */

public class IntervalSetEmptyTest {
    // Testing strategy
    //   empty()
    //     no inputs, only output is empty interval set
    //     observe with labels()
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testEmptyVerticesEmpty() {
        assertEquals("expected empty() graph to have no vertices",
                Collections.emptySet(), IntervalSet.empty().labels());
    }
    
    // TODO test other label types
    
}
