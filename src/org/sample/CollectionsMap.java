package org.sample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsMap {

	public static void main(String[] args) {

		Map<Integer, String> mp = new LinkedHashMap<Integer, String>();

		mp.put(20, "java");
		mp.put(40, "Selenium");
		mp.put(10, "framework");
		mp.put(70, "python");
		mp.put(50, "jira");
		mp.put(80, "jenkins");
		mp.put(20, "GIT");

		System.out.println(mp);

		boolean containsKey = mp.containsKey(10);
		System.out.println(containsKey);

		boolean containsValue = mp.containsValue("jira");
		System.out.println(containsValue);

		Set<Integer> z = mp.keySet();
		System.out.println(z);

		System.out.println("\nIterate by using enhanced loop in keyset");
		for (Integer c : z) {
			System.out.println(c);

		}

		Collection<String> values = mp.values();
		System.out.println(values);

		System.out.println("\nIterate by using enhanced ForLoop by values");
		for (String b : values) {
			System.out.println(b);

		}

		Set<Entry<Integer, String>> entrySet = mp.entrySet();
		System.out.println(entrySet);

		System.out.println("\nWhole map entries by using enhanced forLoop");
		for (Entry<Integer, String> m : entrySet) {
			System.out.println(m);

		}
		System.out.println("key and value iteration");
		for (Entry<Integer, String> l : entrySet) {
			
			
			System.out.println("key "+l.getKey());
			System.out.println("values "+l.getValue());
			
		}

	}

}
