/**
 * 
 */
package chapter7;

import java.util.*;

/**
 * @author I
 * @param <E>
 * This class helps to work with iterator as Enumeration
 *
 */
public class IteratorEnumeration<E> implements Enumeration<E> {
	Iterator<E> iterator;

	public IteratorEnumeration(Iterator<E> iterator) {
		// TODO Auto-generated constructor stub
		this.iterator = iterator;
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public E nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}
}
