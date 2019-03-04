package interval;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Collections;

/**
 * Tests for instance methods of IntervalSet.
 * 
 * <p>PS2 instructions: you MUST NOT add constructors, fields, or non-@Test
 * methods to this class, or change the spec of {@link #emptyInstance()}.
 * Your tests MUST only obtain IntervalSet instances by calling emptyInstance().
 * Your tests MUST NOT refer to specific concrete implementations.
 */
public abstract class IntervalSetTest {
	// Testing strategy
    // TODO
    
    /**
     * Overridden by implementation-specific test classes.
     * 
     * @return a new empty IntervalSet of the particular implementation being tested
     */
    public abstract IntervalSet<String> emptyInstance();
    
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    @Test
    public void testInitialLabelsEmpty() {
        // TODO you may use, change, or remove this test
        assertEquals("expected new interval set to have no intervals",
                Collections.emptySet(), emptyInstance().labels());
    }
    
    // TODO other tests for instance methods of IntervalSet	
}
