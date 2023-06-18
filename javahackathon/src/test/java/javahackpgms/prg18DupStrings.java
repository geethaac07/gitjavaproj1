package javahackpgms;

import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class prg18DupStrings {
//Q18. WJP to display duplicate character in string
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println("Enter the string");
		String str = scn.nextLine();
		char ch[] = str.toCharArray();

		int cnt;
		for (char c : ch) {
			if (hm.containsKey(c)) {
				cnt = hm.get(c);
				hm.put(c, cnt + 1);
			} else
				hm.put(c, 1);
		}
		Set<Entry<Character, Integer>> eSet = hm.entrySet();
		Iterator<Entry<Character, Integer>> it = eSet.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			if (entry.getValue() > 1)
				System.out.println("\nThe duplicate character is:: " + entry.getKey());
		}

		scn.close();
	}

}
