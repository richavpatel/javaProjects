package p4ExtraMaterial;

import java.util.Arrays;

public class Pointers {
	
	public static void main(String[] args) {
		
		// in primitive variables, the value is stored directly in the variable
		int primitive1 = 5;
		System.out.println("The value of primitive1 is " + primitive1 + "\n");
		
		// in array variables, the values are stored on the memory heap.  the 
		// variable holds the *address* on the heap of the first value in the
		// array.  in programming this address is often called a pointer, 
		// because it points to where the data is in memory.
		int[] array1 = {1, 3, 5, 7, 9};
		int[] array2 = {1, 3, 5, 7, 9};
		
		System.out.println("The value of array1 is " + array1);
		System.out.println("The values stored in array1 are " + Arrays.toString(array1));
		System.out.println();
		System.out.println("The value of array2 is " + array2);
		System.out.println("The values stored in array2 are " + Arrays.toString(array2));
		System.out.println();
		
		
		// when we use == to compare array variables, we are really comparing
		// the memory addresses stored in those variables.  this is probably 
		// not what we want.
		System.out.println("This is what we get with ==");
		if (array1 == array2) {
			System.out.println(array1 + " equals " + array2);
		} else {
			System.out.println(array1 + " does not equal " + array2);
		}
		System.out.println();
		
		// to compare the values in two arrays to determine if the arrays are
		// equal, use the Arrays.equals method.
		System.out.println("This is what we get with Arrays.equals");
		if (Arrays.equals(array1, array2)) {
			System.out.println(Arrays.toString(array1) + " equals " + Arrays.toString(array2));
		} else {
			System.out.println(Arrays.toString(array1) + " does not equal " + Arrays.toString(array2));
		}
		System.out.println();
		
		
		// pointers also affect copying arrays. this statement is storing the 
		// address in array1 into the variable array3.  so now both of these
		// variables point to the same place in memory.  that means that if we
		// change one of these arrays, both of them change.  again, this is 
		// probably not what we want.  we can use the Arrays.copyOf method 
		// instead.
		System.out.println("Using the assignment (=) operator");
		int[] array3 = array1;
		
		System.out.println("The values stored in array1 are " + Arrays.toString(array1));
		System.out.println("The values stored in array3 are " + Arrays.toString(array3));
		System.out.println();
		
		array3[0] = 42;
		
		System.out.println("The values stored in array1 are " + Arrays.toString(array1));
		System.out.println("The values stored in array3 are " + Arrays.toString(array3));
		System.out.println();
		
		System.out.println("Using Arrays.copyOf");
		array1[0] = 1;
		int[] array4 = Arrays.copyOf(array1, array1.length);
		
		System.out.println("The values stored in array1 are " + Arrays.toString(array1));
		System.out.println("The values stored in array4 are " + Arrays.toString(array4));
		System.out.println();
		
		array4[0] = 26;
		
		System.out.println("The values stored in array1 are " + Arrays.toString(array1));
		System.out.println("The values stored in array4 are " + Arrays.toString(array4));
		System.out.println();
	}

}
