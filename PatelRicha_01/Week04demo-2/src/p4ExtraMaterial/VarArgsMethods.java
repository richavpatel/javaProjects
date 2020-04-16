package p4ExtraMaterial;

public class VarArgsMethods {

	// you can declare methods that take a variable number of arguments.  these
	// types of parameters are treated as an array.  a method can have at most
	// one vararg parameter, and it must be the last parameter. 
	
	// the syntax is an ellipses (three periods in a row)
	public static int sum(int... values) {
		
		int total = 0;
		
		for (int value: values) {
			total += value;
		}
		
		return total;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sum(1, 5, 9, 10));
		
		System.out.println(sum(1, 6));
		
		System.out.println(sum(4));
		
		System.out.println(sum());
	}
}
