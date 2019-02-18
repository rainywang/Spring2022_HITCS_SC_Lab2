package interval;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 * An implementation of IntervalSet.
 * 
 * <p>PS2 instructions: you MUST use the provided rep.
 */

public class RepListIntervalSet implements IntervalSet<String> {
	
	/**
	 * e.g., { "A"=[0,10), "B"=[20,30) } is represented by
	 * 	labelList = <"A", "B">
	 *  valueList = <0, 10, 20, 30>
	 */
	
	private final List<String> labelList = new ArrayList<>();
	private final List<Long> valueList = new ArrayList<>();
	
    // Abstraction function:
    //   TODO
    // Representation invariant:
    //   TODO
    // Safety from rep exposure:
    //   TODO
    
    // TODO constructor
    
    // TODO checkRep
	
	@Override
	public void insert​(long start, long end, String label) throws IntervalConflictException  {
        throw new RuntimeException("not implemented");
	}
	
	@Override
	public Set<String> labels() {
        throw new RuntimeException("not implemented");
    }
	
	@Override
	public boolean remove​(String label) {
        throw new RuntimeException("not implemented");
    }
	
	@Override
	public long start​(String label) throws NoSuchElementException {
        throw new RuntimeException("not implemented");
    }
	
	@Override
	public long end(String label) throws NoSuchElementException {
        throw new RuntimeException("not implemented");
    }
	
	@Override
	public String toString() {
        throw new RuntimeException("not implemented");
	}
}
