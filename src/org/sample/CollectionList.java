package org.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {

	public static void main(String[] args) {

		// List Interface

		List<Integer> li1 = new ArrayList<Integer>();
		List<Integer> li2 = new LinkedList<Integer>();

		li1.add(50);//index 0
		li1.add(90);//index 1
		li1.add(80);//index 2
		li1.add(30);//index 3
		li1.add(10);//index 4
		li1.add(60);//index 5
		li1.add(20);//index 6
		li1.add(10);//index 7
		li1.add(null);//index 8
		li2.add(100);
		li2.add(30);
		li2.add(300);
		li2.add(500);
		li2.add(20);
		li2.add(10);
		
		//removeAll
		
		System.out.println(li1);
		System.out.println(li2);
		
		li2.removeAll(li1);
		System.out.println(li2);
		
		boolean equals = li2.equals(li1);
		System.out.println(equals);
		
		
		
		
		

	}

}
