package javahackpgms;

import java.util.Scanner;

public class prg14wordsReverse {
//Q14. Given a string print the reverse of the words string.(Input:  Java Code Output: Code Java)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = new String(scn.nextLine());
		String str1[] = str.split("\\s");
		System.out.println("\nReversed words are:");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}
		scn.close();
	}

}
