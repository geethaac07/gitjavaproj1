package javahackpgms;

import java.util.Scanner;

public class prg24ConsecutiveNumber {
//Q24. Write a program which inputs a positive natural number N and prints the 
	// possible consecutive number combinations, which when added give N.

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int i = scn.nextInt();

		int res1 = i / 2;
		int res2 = i % 2;
		int res3 = res1 + res2;
		int res4 = res3 / 2;
		int res5 = res3 - res4;

		System.out.println("first combination to get " + i + " value is: " + res1 + "+" + res3);

		System.out.println("secondcombination to get " + i + " value is: " + res4 + "+" + res5 + "+" + res1);

		scn.close();
	}

}
