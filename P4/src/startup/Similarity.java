package startup;

import java.io.File;
import java.io.IOException;

import interval.MultiIntervalSet;

/**
 * A [TODO mutable?] measure of similarity between multi-interval sets of
 * Strings. 
 * 
 * An instance of Similarity uses a client-provided definition of label
 * similarities, where 0 is least similar and 1 is most similar.
 * 
 * Given two multi-interval sets, let min be the minimum start of any of their
 * intervals, and let max be the maximum end. The similarity between the two
 * sets is the ratio: 
 * 		(sum of piecewise-matching between the sets) / (max - min)
 * 
 * The amount of piecewise-matching for any unit interval [i, i+1) is:
 * 		0 if neither set has a label on that interval 
 * 		0 if only one set has a label on that interval 
 * 		otherwise, the similarity between the labels as defined for this Similarity instance 
 * 
 * For example, suppose you have multi-interval sets that use labels "happy", "sad", and "meh"; 
 * and similarity between labels is defined as:
 * 
 * 		1 if both are "happy", both "sad", or both "meh" 
 * 		0.5 if one is "meh" and the other is "happy" or "sad" 
 * 		0 otherwise 
 * 
 * Then the similarity between these two sets: 
 * 		{ "happy" = [[0, 1), [2,4)], "sad" = [[1,2)] } 
 * 		{ "sad" = [[1, 2)], "meh" = [[2,3)], "happy" = [[3,4)] } 
 * 
 * would be: (0 + 1 + 0.5 + 1) / (4 - 0) = 0.625
 * 
 * PS2 instructions: this is a required ADT class, and you MUST NOT weaken the
 * required specifications. However you MAY strengthen the specifications and
 * you MAY add additional methods.
 */

public class Similarity {
	
	/**
	 * Create a new Similarity where similarity between labels is defined in the given file. 
	 * Each line of similarities must contain exactly three pieces, separated by one or more spaces. 
	 * The first two pieces give a pair of strings, and the third piece gives the decimal similarity 
	 * between them, in a format allowed by Double.valueOf(String), between 0 and 1 inclusive. 
	 * 
	 * Similarity between labels is symmetric, so the order of strings in the pair is irrelevant. 
	 * A pair may not appear more than once. The similarity between all other pairs of strings is 0. 
	 * This format cannot define non-zero similarity for strings that contain newlines or spaces, 
	 * or for the empty string.
	 * 
	 * For example, the following file defines the similarity function used in the example at the top of this class:

 	 * happy happy 1
 	 * sad   sad   1
 	 * meh   meh   1
 	 * meh   happy 0.5
 	 * meh   sad   0.5

	 * @param similarities label similarity definition as described above
	 * @throws IOException if the similarity file cannot be found or read
	 */
	public Similarity(File similarities) throws IOException {
		throw new RuntimeException("not implemented");
	}
	
	/**
	 * Compute similarity between two multi-interval sets. Returns a value between 0 and 1 inclusive.
	 * 
	 * @param a non-empty multi-interval set of strings
	 * @param b non-empty multi-interval set of strings
	 * @return similarity between a and b as defined above
	 */
	public double similarity​(MultiIntervalSet<String> a, MultiIntervalSet<String> b) {
		throw new RuntimeException("not implemented");	
	}
}
