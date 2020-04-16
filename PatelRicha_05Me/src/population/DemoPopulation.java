package population;

import java.util.Scanner;

public class DemoPopulation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("USA Number of males: ");
		int male = input.nextInt();
		System.out.print(" USA Number of females: ");
		int female = input.nextInt();
		System.out.print("USA Number of Squre miles : ");
		double squre = input.nextDouble();
		System.out.print("USA Number of States : ");
		int states =input.nextInt();
		
		Population Usa = new Population("usa" , male, female, squre, states);
		
		Population Germany = new Population("Germany", 310342,56456,654.4,40);
		
		Population Argentina = new Population("Argentina", 435435,434543,453.67,80);
		System.out.println(Usa.toString());
		System.out.println(Germany.toString());
		System.out.println(Argentina.toString());
		

	}

}
