/**
 * 
 */
package chapter7;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author I
 * This interface will help to work with Enumeration like Iterator.
 *
 */
public class EnumerationIterator<E> implements Iterator<E> {
	Enumeration<E> enumeration;
	
	public EnumerationIterator(Enumeration<E> enumeration) {
		// TODO Auto-generated constructor stub
		this.enumeration = enumeration;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}
	
	@Override
	public E next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}

}
