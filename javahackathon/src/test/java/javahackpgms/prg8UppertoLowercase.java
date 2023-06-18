package javahackpgms;

import java.util.Scanner;

public class prg8UppertoLowercase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string in all Upper case");
		String str1 = scn.next();
		System.out.println("String convertion to Lower Case: " +str1.toLowerCase());
		scn.close();
	}

}
