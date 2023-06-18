package javahackpgms;

import java.util.Scanner;

public class prg10StringSubsequence {
//Q10. What is String subsequence method?
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		System.out.println("Enter the begin index");
		int begin = scn.nextInt();
		System.out.println("Enter the end index");
		int end = scn.nextInt();
		System.out.println("Susbsequence of the string is : " +str.subSequence(begin,end));
		scn.close();
	}

}
