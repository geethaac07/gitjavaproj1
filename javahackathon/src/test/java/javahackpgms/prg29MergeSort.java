package javahackpgms;

import java.util.Scanner;

public class prg29MergeSort {

	public static void main(String[] args) {
		//Q29. WJP to perform Merge sort using recursion
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scn.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < n; i++)
		{
			arr[i] = scn.nextInt();
		}
		splitArrays(0,n-1,arr);
		System.out.println("\nArray elements after sorting:\n");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		scn.close();
	}

	public static void splitArrays(int low, int high,int arr[])
	{
		int mid = (low+high)/2;
		if(low<high)
		{
			splitArrays(low,mid,arr);
			splitArrays(mid+1,high,arr);
			merge(low,mid,high,arr);
		}
		
	}
	public static void merge(int low, int mid, int high,int arr[])
	{
		
		int left = low;
		int right = mid+1;
		int n=arr.length;
		int arr1[] = new int[n];
		int k=low;
		
		while(left <=mid && right <=high)
		{
			if (arr[left] < arr[right])
			{
				arr1[k]=arr[left];
				left++;
				k++;
			}
			else
			{
				arr1[k]= arr[right];
				right ++;
				k++;
			}
		}
		while (left<=mid)
		{
			if (arr[left] <= arr[mid])
			{
				arr1[k]=arr[left];
				left++;
				k++;
			}
		}
		
		while(right<=high)
		{
			if(arr[right] >=arr[high])
			{
				arr1[k] = arr[right];
				right++;
				k++;
			}
			
		}
		for(int c=low;c<=high;c++)
		{
			arr[c]=arr1[c];
		}
		
	}
}
