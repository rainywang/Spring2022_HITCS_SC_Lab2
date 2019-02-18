package interval;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class RepMapIntervalSet implements IntervalSet<String> {

	/**
	 * e.g., { "A"=[0,10), "B"=[20,30) } is represented by
	 * 	startMap = { <"A", 0>, <"B", 20> }
	 *  endMap = { <"A", 10>, <"B", 30> }
	 */
	private final Map<String, Long> startMap = new HashMap<>();
	private final Map<String, Long> endMap = new HashMap<>();
	
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
