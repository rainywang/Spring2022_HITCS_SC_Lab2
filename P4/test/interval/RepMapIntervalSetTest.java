package interval;

/**
 * Tests for RepMapIntervalSet.
 * 
 * This class runs the IntervalSetTest tests against RepMapIntervalSet, as
 * well as tests for that particular implementation.
 * 
 * Tests against the IntervalSet spec should be in RepMapIntervalSet.
 */

public class RepMapIntervalSetTest extends IntervalSetTest {
	/*
	 * Provide a RepListIntervalSet for tests in IntervalSetTest.
	 */
	
	@Override
	public IntervalSet<String> emptyInstance() {
		return new RepMapIntervalSet();
	}

	/*
	 * Testing RepMapIntervalSet...
	 */

	// Testing strategy for RepMapIntervalSet.toString()
	// TODO

	// TODO tests for RepMapIntervalSet.toString()
}
