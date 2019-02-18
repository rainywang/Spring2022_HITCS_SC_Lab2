package interval;

/**
 * Thrown to indicate an interval set conflict.
 * 
 * PS2 instructions: do NOT change this class.
 */

public class IntervalConflictException extends Exception {
	
	/**
	 * Make a new interval conflict exception with the given detail message
	 * @param message the detail message
	 */
	public IntervalConflictException(String message) {
		super(message);
	}

}
