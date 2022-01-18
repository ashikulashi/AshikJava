package org.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>();
		Set<Integer> s=new LinkedHashSet<>();
		
		
		li.add(30);
		li.add(20);
		li.add(40);
		li.add(60);
		li.add(50);
		li.add(20);
		
		System.out.println(li);
		System.out.println(s);//Before addAll
		
		s.addAll(li);
		
		System.out.println(li);
		System.out.println(s);//After addAll
		
		

		
	}

}
