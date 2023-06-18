package javahackpgms;
import java.util.Scanner;
public class prg5UniqueDupCount {

	public static void main(String[] args) {
		// Q5. Given an array prints the unique numbers and also print the number of
		// occurrences of duplicate numbers.
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scn.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = scn.nextInt();
		}
		int count[] = new int[n];
		int i, j;
		int cnt;

		for (i = 0; i < n; i++) {
			cnt = 1;
			for (j = i + 1; j < n; j++) {
				if (arr1[i] == arr1[j]) {
					cnt++;
					count[j] = -1;
				}
			}
			if (count[i] != -1) {
				count[i] = cnt;
			}
		}

		for (i = 0; i < n; i++) {
			if (count[i] != -1) {
				if (count[i] > 1)
					System.out.println("duplicate number " + arr1[i] + " occurred " + count[i] + " times");
				else
					System.out.println(arr1[i] + " is a unique number");
			}
		}
		scn.close();
	}

}
