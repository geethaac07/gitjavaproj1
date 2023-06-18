package javahackpgms;

import java.util.Scanner;

public class prg6SelectionSort {
//Q6.	WJP to perform ascending order Selection  sort
	public static void SelectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		SelectionSort(arr);
		System.out.println("\nArray elements after sorting:\n");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		scn.close();
	}

}
