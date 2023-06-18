package javahackpgms;

import java.util.Scanner;

//Q2.	write a program to find factorial (Non Recursive)

public class prg2FactorialNonRecursive {

	public static int factorial(int n)
	{
		int res=1;
		int i=n-1;
		
		for(int j=n;j>=1;j--)
		{
			res = res * (j * (n-i));
		}
			return res;		
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number");
		int n= scn.nextInt();
		int fact = factorial(n);
		System.out.println("Factorial value of "+n +" is: " +fact);
		scn.close();

	}

}
