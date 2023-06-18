package javahackpgms;

import java.util.Scanner;

public class prg12PalinIntStrings {
//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
	public static void main(String[] args) {
		// Checking for String palindrome
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str1 = scn.nextLine();
		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}

		System.out.println(str2);

		if (str1.equals(str2) == true)
			System.out.println("\nThe Given String is Palindrome");
		else
			System.out.println("\nThe Given String is NOT a Palindrome");

		// Checking for Integer palindrome
		System.out.println("\n\nEnter the number");
		int val1 = scn.nextInt();
		String str3 = Integer.toString(val1);
		String str4 = "";
		for (int i = str3.length() - 1; i >= 0; i--) {
			str4 = str4 + str3.charAt(i);
		}
		if (str3.equals(str4) == true)
			System.out.println("\nThe Given number is Palindrome");
		else
			System.out.println("\nThe Given number is NOT a Palindrome");

		scn.close();
	}

}
