/**
 * 
 */
package chapter7;

import java.util.*;

/**
 * @author I
 *
 */
public class EnumerationIteratorTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector = new Vector<String>();
		vector.add("1");
		vector.add("2");		
		vector.add("3");
		
		Iterator<String> iterator = new EnumerationIterator<String>(vector.elements());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
