package javahackpgms;

import java.util.Scanner;

public class prg4PalindromeofInt {
	// Q4. Given an array of integers check the Palindrome of the series.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = scn.nextInt();
		System.out.println("Enter the array elements:");
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		for (int i = 0; i < n; i++)
			arr1[i] = scn.nextInt();
		System.out.println();
		
		for (int i = n - 1; i >= 0;) {
			for (int j = 0; j < n; j++) {
				arr2[j] = arr1[i];
				i--;
			}
		}
		System.out.println("\nReversed array is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr2[i]);
		int res = 0;
		for (int i = 0; i < n ; i++) {
			if (arr1[i] == arr2[i])
				res = 1;
			else
				res = -1;
		}

		if (res == 1)
			System.out.println("\nThe given array is a palindrome array.");
		else
			System.out.println("\nThe given array  is NOT a palindrome array.");
		scn.close();
	}

}
