/* Richa Patel 
 * Assignment 5
 *  
 */
package edu.sinclair;

import java.util.HashSet; 
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Utilities {

	public <T> void removeDuplicates(final List<T> items) {
		if (items == null || items.isEmpty() || items.size() == 1) {
			return;
		}
		Set<T> set = new HashSet<>();
		Iterator<T> it = items.iterator();
		while (it.hasNext()) {
			T element = it.next();
			if (set.contains(element)) {
				it.remove();
			} else {
				set.add(element);
			}
		}
	}

	public <E> E linearSearch(List<E> list, E key) {
		if (list == null) {
			return null;
		}
		E found = null;
		for (int i = 0; i < list.size(); i++) {
			E object = list.get(i);
			if (object.equals(key)) {
				found = object;
				break;
			}
		}
		return found;
	}
}