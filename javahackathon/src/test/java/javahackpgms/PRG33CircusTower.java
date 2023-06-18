package javahackpgms;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;
public class PRG33CircusTower {

	public static void main(String[] args) {
		TreeMap <Integer,Integer> tMap = new TreeMap <Integer,Integer> ();
		
		tMap.put(65,100);
		tMap.put(70,150);
		tMap.put(56, 90);
		tMap.put(75, 190);
		tMap.put(60, 95);
		tMap.put(68,110);
		
		
		Set<Entry<Integer,Integer>> eSet = tMap.entrySet();
		Iterator<Entry<Integer,Integer>> it = eSet.iterator();
		System.out.println("The length of the tower: "+tMap.size());
		while(it.hasNext())
		{
		Entry<Integer,Integer> item = it.next();
		System.out.println(item.getKey() +"," +item.getValue());
		}
		
	}

}
