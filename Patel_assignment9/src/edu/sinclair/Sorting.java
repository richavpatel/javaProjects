/* Patel Richa`
 * 
 * Assignment 9
 */

package edu.sinclair;

import java.util.Arrays;

public class Sorting {

	public <T extends Comparable<T>> void insertionSort(T[] list) {
		for (int i = 1; i < list.length; i++) {
			/** Insert list[i] into a sorted sublist list[0..i-1] so that
		         list[0..i] is sorted. */
			T currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
				list[k + 1] = list[k];
			}
			// Insert the current element into list[k + 1]
			list[k + 1] = currentElement;
		}
	}

	public <T extends Comparable<T>> void quickSort(T[] list) {
		quickSort(list, 0, list.length - 1);
	}

	public <T extends Comparable<T>> void quickSort(T[] list, int first, int last) {
		if(last > first ) {
			int pivotIndex = partition(list, first, last); 
			quickSort(list, first, pivotIndex - 1); 
			quickSort(list, pivotIndex + 1, last);
		}
	}

/** Partition the array list[first..last] */
public <T extends Comparable<T>> int partition(T[] list, int first, int last) {
	/**
	 * System.out.println("hey" + Arrays.toString(list));

	int pivotIndex = 0;
	if(list.length < 3) {
		pivotIndex = 0;
	} else {
		T[] temp = Arrays.copyOfRange(list, 0, 3);
		Arrays.sort(temp);
		T a = temp[1];
		for(int i=0; i<3; i++) {
			if(a.equals(list[i])) {
				pivotIndex = i;
				break;
			}
		}
		// Move pivot to first Index...
		T tempo = list[first];
		list[first] = list[pivotIndex];
		list[pivotIndex] = tempo;
	}
	
		 */
	
	
	T pivot = list[first]; 
	display(list, pivot);
	// Choose the first element as the pivot 17 
	int low = first + 1; // Index for forward search
	int high = last; 
	// Index for backward search

	while (high > low) {
		// Search forward from left
		while (low <= high && list[low].compareTo(pivot) <= 0)
			low++;

		// Search backward from right
		while (low <= high && list[high].compareTo(pivot) > 0)
			high--;

		// Swap two elements in the list
		if (high > low) {
			T temp = list[high]; 
			list[high] = list[low]; 
			list[low] = temp;
		} 
	} 


	while (high > first && list[high].compareTo(pivot) >= 0) high--;
	if (list[high].compareTo(pivot) <= 0){ 
		list[first] = list[high]; 
		list[high] = pivot;
		return high;
	}else {
		return first; 
	}
} 




private <T extends Comparable<T>> void display(T[] arr, T pivot) {
	System.out.println("Pivot is " + pivot);
	System.out.println("Array is " + Arrays.toString(arr));
}
}



