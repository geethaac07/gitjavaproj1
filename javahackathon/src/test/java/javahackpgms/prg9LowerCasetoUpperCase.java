package javahackpgms;

import java.util.Scanner;

public class prg9LowerCasetoUpperCase {
//	Q9. How can we make String Lower case to Upper case?
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string in all lower case");
		String str1 = scn.next();
		System.out.println("String convertion to Upper Case: " +str1.toUpperCase());
		scn.close();
	}

}
