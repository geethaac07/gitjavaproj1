package javahackpgms;

import java.util.Scanner;

public class prg22IntToString {
	//Q22. WJP to convert int to string
	
		
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the number");
			int i= scn.nextInt();
			String str = Integer.toString(i);
			System.out.println("Integer converted into String: " +str);
			scn.close();
	}

}
