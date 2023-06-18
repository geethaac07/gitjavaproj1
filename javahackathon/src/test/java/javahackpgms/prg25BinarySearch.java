package javahackpgms;
import java.util.Scanner;
import java.util.Arrays;

public class prg25BinarySearch {
// Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.

	public static int BinarySearch(int arr[], int key) {
		Arrays.sort(arr); // Call the sort before performing search
		int high = arr.length - 1; 	int low = 0; int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == key) 
				return 1;
			if (arr[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		System.out.println("Enter the number to search:");
		int key = scn.nextInt();
		int result = BinarySearch(arr, key);
		if (result != -1)
			System.out.println("\nKey value " + key + " is found in the array");
		else
			System.out.println("\nKey value " + key + " is NOT found in the array");
		scn.close();
	}
}
