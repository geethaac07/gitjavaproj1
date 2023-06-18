package javahackpgms;

import java.util.Scanner;

public class prg16RemoveChar {
//Q16. Write a method that will remove given character from the String?

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string: \n");
		String str = scn.nextLine();
		System.out.println("Enter a charactor to be removed: \n");
		String s = scn.next(); 
		
		System.out.println("String after char removal: " +str.replace(s, " "));
		
		scn.close();
	}

}
