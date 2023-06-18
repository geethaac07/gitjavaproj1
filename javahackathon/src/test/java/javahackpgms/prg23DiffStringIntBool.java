package javahackpgms;

import java.util.Scanner;

public class prg23DiffStringIntBool {

	public static boolean isInteger(String str)
	{
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c >= '0' && c <= '9') 
			return true;
		}
		return false;
	}
	
	public static boolean isString(String str)
	{
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') 
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the input string");
		String str = scn.next();
		
		if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false"))
			System.out.println("The input is a boolean");
		else if (isInteger(str) == true)
			System.out.println("The input is an Integer");		
		else if (isString(str) == true)
			System.out.println("The input is a String");
		System.out.println();
		scn.close();
	}

}
