package javahackpgms;


public class prg11StrSplit {
//Q11. How to Split String in java?

	public static void main(String[] args) {
		
		String str = "Hello World";
		String[] str2 = str.split("\\s"); //split with white space
		for (String s: str2)
		System.out.println("Splitted string is: " +s);
		
	}

}
