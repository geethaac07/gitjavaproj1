package javahackpgms;

import java.util.Arrays;
import java.util.Scanner;

public class prg3Intsort {
	//Q3.	Given an array of integers, sort the integer values.
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter all the array elements: \n");
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		//Arrays.sort(arr);
		sort(arr);
		System.out.println("Array elements after sorting:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		scn.close();
	}

}
