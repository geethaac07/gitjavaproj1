package javahackpgms;

import java.util.Scanner;

public class prg13StringReverse {
//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		StringBuilder str = new StringBuilder(scn.nextLine());
		System.out.println("\nReversed String is:" +str.reverse());
		scn.close();
	}

}
