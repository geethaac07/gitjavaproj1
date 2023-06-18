package javahackpgms;

import java.util.Scanner;

public class prg21StrToInteger {
//Q21. WJP to convert string to int
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		int i = Integer.parseInt(str);
		System.out.println("String converted into Integer " +i);
		scn.close();
	}

}
