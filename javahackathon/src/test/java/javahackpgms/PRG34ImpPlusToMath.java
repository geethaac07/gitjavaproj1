package javahackpgms;

import java.util.Scanner;

public class PRG34ImpPlusToMath {
	static int a, b, result = 0;

	public static void Subtraction(int a, int b) {
		result = a + (-b);
		System.out.println("subtraction Result: " + result);
	}

	public static void Multiply(int a, int b) {
		for (int i = 1; i <= b; i++) {
			result += a;
		}
		System.out.println("Multiplication Result: " + result);
	}

	public static void div(int a, int b) {
		result = 0;
		while (a >= b) {
			a = a + (-b);
			result++;
		}
		System.out.println("Division Result: " + result);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b;
		System.out.println("Enter values for a & b");
		a = scn.nextInt();
		b = scn.nextInt();
		Multiply(a, b);
		Subtraction(a, b);
		div(a, b);
		scn.close();
	}

}
