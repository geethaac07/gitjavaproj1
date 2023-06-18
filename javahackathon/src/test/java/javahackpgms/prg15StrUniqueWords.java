package javahackpgms;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class prg15StrUniqueWords {
//Q15. Given a string print the unique words of the string
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = scn.nextLine();
		String str1[] = str.split("\\s");
		HashSet<String> hs = new HashSet<String>();
		
		for (String s:str1)
		{
			hs.add(s);
		}
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.print (it.next()+" ");
		}
		
		scn.close();
	}

}
