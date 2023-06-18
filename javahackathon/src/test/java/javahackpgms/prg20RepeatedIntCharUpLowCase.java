package javahackpgms;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class prg20RepeatedIntCharUpLowCase {
//Q20. WJP to find total number of repeated integers, uppercase and 
	// lowercase character in the give string
	static char[] ch;
	static int cnt1;

	public static HashMap<Character, Integer> AddtoHashMap(String[] str) {
		for (int i = 0; i < str.length; i++) {
			ch = str[i].toCharArray();
		}
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char s : ch) {
			if (hm.containsKey(s)) {
				cnt1 = hm.get(s);
				hm.put(s, cnt1 + 1);
			} else
				hm.put(s, 1);
		} 	return hm;
	}
	public static void callIterator(HashMap<Character, Integer> hm) {
		Set<Entry<Character, Integer>> eSet = hm.entrySet();
		Iterator<Entry<Character, Integer>> it = eSet.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> entry = it.next();
			if (entry.getValue() > 1)
				System.out.println(
						"Repeated characters " + entry.getKey() + "-- occurrence= " + entry.getValue() + " times");
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String with Uppercase/LowerCaseIntegers:\n");
		String str = scn.nextLine();
		String[] sLower = str.split("[^a-z]");
		String[] sUpper = str.split("[^A-Z]");
		String[] sIntegers = str.split("[^0-9]");

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

		hmap = AddtoHashMap(sLower);
		callIterator(hmap);

		// System.out.println("Printing the repeated UpperCases are:");
		hmap1 = AddtoHashMap(sUpper);
		callIterator(hmap1);

		hmap2 = AddtoHashMap(sIntegers);
		// System.out.println("Printing the repeated integers are:");
		callIterator(hmap2);

		scn.close();
	}
}
