package interval;

/**
 * Tests for RepListIntervalSet.
 * 
 * This class runs the IntervalSetTest tests against RepListIntervalSet, as
 * well as tests for that particular implementation.
 * 
 * Tests against the IntervalSet spec should be in IntervalSetTest.
 */

public class RepListIntervalSetTest extends IntervalSetTest {
	/*
	 * Provide a RepListIntervalSet for tests in IntervalSetTest.
	 */
	
	@Override
	public IntervalSet<String> emptyInstance() {
		return new RepListIntervalSet();
	}

	/*
	 * Testing RepListIntervalSet...
	 */

	// Testing strategy for RepListIntervalSet.toString()
	// TODO

	// TODO tests for RepListIntervalSet.toString()
}
