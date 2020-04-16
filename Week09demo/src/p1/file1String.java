package p1;

public class file1String {

	public static void main(String[] args) {
		
		// 1st way to initialize String
		String msg1 = "Hello"; 
		String msg2 = "Goodbye"; 
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		msg1 = "Tuesday";
		msg2 = new String("Wednesday");
		System.out.println(msg2);
		msg2 = "Thursday"; 
		System.out.println("msg1: " + msg2);
//		msg1 = "Thursday";
				
		// 2nd way 
		String myDog = new String("     MiNdY      ");
		String myCat = new String("CaLlie"); 
		System.out.println("\nMy dog's name is " + myDog + ". My cat's name is " + myCat +".");
		
		// 3rd way
		char[] charArray = {'J', 'a', 'v', 'a', ' ', 'S', 't', 'r', 'i', 'n', 'g'};
		String fromCharArray = new String(charArray);
		System.out.println("\n\"fromCharArray\": " + fromCharArray);  // use escape character "backslash"
		
		System.out.println("msg1: " + msg1);
		System.out.println("msg2: " + msg2);
		
		msg2 = msg1; 
		msg2 = new String("Tuesday");
		System.out.println("\nmsg1: " + msg1);
		System.out.println("msg2: " + msg2);
		
		
		if( msg1 == msg2)		// == used to compare memory addresses, NOT contents
			System.out.println("\nStrings are same memory address");
		else
			System.out.println("\nStrings are not the same memory address");
		
		if(msg1.equals(msg2))	// method compares CONTENTS of the variables
			System.out.println("\nyes, Strings have the same content");
		else
			System.out.println("\nNo, Strings do not have the same content");
		
		myDog = myDog.trim();
		System.out.println("myDog (trimmed): " + myDog);
		
		int sizeDog = myDog.length();
		int sizeCat = myCat.length();
		System.out.println("\nMy dog's name has " + sizeDog + " characters");
		System.out.println("My cat's name has " + sizeCat + " characters");
		
		System.out.println("\nall uppercase: " + myDog.toUpperCase());
		System.out.println("all lowercase: " + myCat.toLowerCase());
	
		// example of encapsulation so it won't work
//		String catIndex = myCat[0];
		
		// to get index positions in Strings: 
		System.out.println("\nchar at index 0 (1st position): " + myCat.charAt(0));
		System.out.println("\nchar at index 3 (4th position): " + myCat.charAt(3));
		
		// another way to concatenate
		String str1 = "Today is Tuesday. ";
		String str2 = "I'm in Java class. ";
		String str3 = str1.concat(str2);
		System.out.println("\nstr3: " + str3);
		
		String str4 = str1 + str2;
		System.out.println("\nstr4: " + str4);
		
		
	} // end main

}