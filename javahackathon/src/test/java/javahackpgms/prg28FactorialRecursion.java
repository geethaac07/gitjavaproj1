package javahackpgms;
import java.util.Scanner;

public class prg28FactorialRecursion {
	public static int factorial(int n)
	{
		if(n<=1)
			return n;
		else
		return (n * factorial(n-1));
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
