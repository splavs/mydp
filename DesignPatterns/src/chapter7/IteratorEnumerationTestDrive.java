/**
 * 
 */
package chapter7;

import java.util.*;

/**
 * @author I
 *
 */
public class IteratorEnumerationTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		array.add("1");
		array.add("2");
		array.add("3");
		
		Enumeration<String> enumeration = new IteratorEnumeration<String>(array.iterator());
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}



	}

}
