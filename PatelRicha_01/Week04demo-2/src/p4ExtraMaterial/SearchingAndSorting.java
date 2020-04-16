package p4ExtraMaterial;

import java.util.Arrays;

//two common things to need to do with arrays are to search them to see if
//they contain a certain value and to sort them into either increasing or
//decreasing order.  in fact, these things are so common and it's so 
//important to be able to do them efficiently for very large arrays, that 
//many people have spent a ton of time coming up with different ways to do
//them.  the advanced version of this course covers a variety of different
//search and sort methods, but here we will learn only a couple of examples
//of each.  the examples we are covering here were chosen because they are
//easy to understand.  they are also pretty bad, in the sense that they are 
//slow.  still, every programming student from the beginning of time has 
//learned these in their intro to programming class.

public class SearchingAndSorting {

	// the goal of a search method is to see if a value called the "target"
	// is in an array.  if it is, the search method should return the 
	// index where the target can be found (if the target is in the array
	// more than once, any valid index is ok).  if the target is not in
	// the array, it is customary to return the value -1 to signal this.

	// linear search is the simplest kind of search.  it simply checks to 
	// see if the first value in the array is the target.  if it is, the 
	// method returns that index.  if it isn't, the method checks the 
	// second value in the array, and so on.  if the end of the array is
	// reached without finding the target, -1 is returned.

	public static int linearSearch(int[] array, int target) {
		for (int i=0; i<array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}

		return -1;
	}


	// binary search works ONLY IF THE ARRAY IS ALREADY SORTED.  it's kind of
	// like the "guess a number" game.  if I asked you to guess a number 
	// between 1 and 100 and i would tell you after each guess if it was too
	// high or too low, you would first guess 50.  if that was too high, you 
	// would guess 25.  if that was too low, you would guess 37 (halfway 
	// between 25 and 50), and so on.  this is how binary search works.  I
	// coded this to search a character array instead of an int array, just for
	// variety.

	public static int binarySearch(char[] array, char target) {

		int low = 0;
		int high = array.length;

		while (low < high) {

			int middle = (low + high) / 2;

			if (array[middle] == target) {
				return middle;
			} else if (array[middle] < target) { // guess was too low, search upper half
				low = middle+1;
			} else { // guess was too high, search lower half 
				high = middle-1;
			}
		}

		return -1;
	}


	// sort methods are meant to order the items in an array.  these examples
	// put the items in order from smallest-to-largest, but it is easy to 
	// modify them to do the reverse.

	// selection sort works by finding the smallest item in the array, moving
	// it to the beginning of the array, and then doing the same thing for 
	// the rest of the items (besides the first one, since it's now in the 
	// right place).  when there is only one item left, it must already be in
	// the right place, so the array is sorted.

	public static void selectionSort(double[] array) {

		for (int i=0; i<array.length-1; i++) {

			// select the smallest item in the array between i and the end
			// of the array
			int smallestIndex = i;
			for (int j=i; j<array.length; j++) {
				if (array[j] < array[smallestIndex]) {
					smallestIndex = j;
				}
			}

			// swap that smallest item with the item at location i
			double temp = array[i];
			array[i] = array[smallestIndex];
			array[smallestIndex] = temp;
		}
	}

	// insertion sort works by gradually increasing the size of a sublist that
	// is known to be sorted.  at first only the first array element is in the 
	// sorted sublist.  then the algorithm looks at the second value and puts 
	// it in the sorted sublist in the place it should go, shifting any
	// elements that are greater than it one to the right.  the algorithm is 
	// finished when the size of the sorted sublist is the same size as the
	// whole array.

	public static void insertionSort(int[] array) {

		for (int i=1; i<array.length; i++) {

			int valueToPlace = array[i];

			// this inner for loop moves any values larger than the valueToPlace
			// over one to make room.  when we find the first value that is 
			// smaller, we can break out of the loop and put the new value
			// right after that one.
			int j;
			for (j=i-1; j>=0; j--) {
				if (array[j] > valueToPlace) {
					array[j+1] = array[j];
				} else {
					break;
				}
			}

			array[j+1] = valueToPlace;
		}
	}


	public static void main(String[] args) {

		int[] testIntArray = {2, 7, 9, 1, 4, 22, -4, 6};
		System.out.println("The test array is " + Arrays.toString(testIntArray));

		System.out.println("22 is in the test array at location: " + 
				linearSearch(testIntArray, 22));

		System.out.println("3 is in the test array at location: " + 
				linearSearch(testIntArray, 3));

		char[] testCharArray = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};

		// remember, we have to sort the array before we can use binary search
		// this built-in Java method is one way to do it (or we could use one 
		// of the sort methods we wrote above).
		Arrays.sort(testCharArray);

		System.out.println("The test array is " + Arrays.toString(testCharArray));

		System.out.println("a is in the test array at location: " + 
				binarySearch(testCharArray, 'a'));

		System.out.println("x is in the test array at location: " + 
				binarySearch(testCharArray, 'x'));

		// note that Java's Arrays class has a built-in version of binary search
		System.out.println("g is in the test array at location: " + 
				Arrays.binarySearch(testCharArray, 'g'));

		double[] testDoubleArray = {2.46, 3.14, 4.4, -2.8, 0.0, 42.8, 16.1};
		System.out.println("The unsorted array is " + Arrays.toString(testDoubleArray));

		selectionSort(testDoubleArray);
		System.out.println("After selection sort, the array is " + 
				Arrays.toString(testDoubleArray));

		System.out.println("The unsorted array is " + Arrays.toString(testIntArray));
		insertionSort(testIntArray);
		System.out.println("After insertion sort, the array is " + 
				Arrays.toString(testIntArray));

	}
}
