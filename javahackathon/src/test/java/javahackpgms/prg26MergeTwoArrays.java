package javahackpgms;

import java.util.Arrays;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class prg26MergeTwoArrays {
static int NA=-1;
	public static void main(String[] args) {
		//Q26. WJP to merge two sorted array.(Do not use third array)		
		//array1[10] = 1,2,4,6,9,10		array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
		int arr1[] = {1,2,4,6,9,10,NA,NA,NA,NA};	//
		int arr2[] = {3,5,7,8};
		int a1_size = 6;
		int a2_size = 4;
		sortedMerge(arr1,arr2,a1_size,a2_size);
		for(int c=0;c<=arr1.length;c++)
		{
			System.out.println(arr1[c]);
		}
	}	
	static void sortedMerge(int a[], int b[], int n, int m)
    {
        int i = n - 1;
        int j = m - 1;
         
        int lastIndex = n + m - 1;
         
        // Merge a and b, starting
        // from last element in each
        while (j >= 0)
        {
         
            /* End of a is greater than end of b */
            if (i >= 0 && a[i] > b[j])
            {
                // Copy Element
                a[lastIndex] = a[i];
                i--;
            } else
            { 
                // Copy Element
                a[lastIndex] = b[j];
                j--;
            }
            // Move indices
            lastIndex--;
        }
    }
     

	
/*		for(int i=0;i<arr1.length-1;i++)
		{
			for(int j=0;j<arr2.length-1;j++)
			{
				if (arr1[i]>arr2[j])
				{
					
				}
			}
		}*/
		

	
	
	
	/*		public static void merge(int low, int mid, int high,int arr[])
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
			}*/
	}


