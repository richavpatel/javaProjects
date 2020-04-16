package p1;

public class file3StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder strB = new StringBuilder("We sold ");
		System.out.println(strB);
		
		// StringBuilder changes so you can append, remove, etc. & it changes. SAME memory address.
		strB.append("12 ");   
		System.out.println(strB);
		
		strB.append("doughnuts for $");
		System.out.println(strB);
		
		strB.append("0.75 each.");
		System.out.println(strB);
		
		strB.replace(8, 10, "5678");
		System.out.println(strB);
	

		// everything displayed is still at the SAME memory address

	} // end main

} // end class