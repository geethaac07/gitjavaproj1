package javahackpgms;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
public class prg19Occurences {
// Q19. WJP to display number of occurrence of all character
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println("Enter the string");
		String str = scn.nextLine();
		char ch[] = str.toCharArray();

		int cnt;
		for (char c:ch)
		{
			if(hm.containsKey(c)) {
				cnt=hm.get(c);
				hm.put(c,cnt+1);
			}
			else
				hm.put(c,1);
		}
		Set<Entry<Character, Integer>> eSet = hm.entrySet(); 
		Iterator <Entry<Character, Integer>> it = eSet.iterator();
		while(it.hasNext())
		{
		Entry<Character, Integer> entry = it.next();
		System.out.println(entry.getKey()+" occurred "+entry.getValue() +" times");
		}

		scn.close();
	}

}
