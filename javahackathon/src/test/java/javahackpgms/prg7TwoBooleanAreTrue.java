package javahackpgms;

import java.util.Scanner;

public class prg7TwoBooleanAreTrue {
//Q7.	Consider there is a 3 Boolean variable called a, b, c. 
	//Check if at least two out of three Booleans are true   
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean a, b, c;
		System.out.println("Enter the first boolean value");
		a = scn.nextBoolean();
		System.out.println("Enter the 2nd boolean value");
		b = scn.nextBoolean();
		System.out.println("Enter the 3rd boolean value");
		c = scn.nextBoolean();
		
		if (a ? (b || c): (b && c) == true)
			System.out.println("At least two booleans are true");
		else
			System.out.println("two booleans are not true");
		
		scn.close();
	}

}
