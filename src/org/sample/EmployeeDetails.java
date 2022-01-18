package org.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setIdNo(3456);
		e1.setName("Ashwin");
		e1.setPhoneNo(9869758758l);
		
		Employee e2=new Employee();
		e2.setIdNo(9875);
		e2.setName("praveen mathew");
		e2.setPhoneNo(987858588858l);
		
		Employee e3=new Employee();
		e3.setIdNo(8765);
		e3.setName("Ashik");
		e3.setPhoneNo(97986975879l);
		
		 
		//userDefined Map
		
		Map<Integer, Employee>  mp=new HashMap<Integer, Employee>();
		
		mp.put(1, e1);
		mp.put(2, e2);
		mp.put(3, e3);
		
		Set<Entry<Integer, Employee>> s = mp.entrySet();
		
		for (Entry<Integer, Employee> c : s) {
			
			System.out.println(c.getKey()+"EmployeeDetails");
			System.out.println("id no is "+c.getValue().getIdNo());
			System.out.println("Name is "+c.getValue().getName());
			System.out.println("Phone no is "+c.getValue().getPhoneNo());
			
		}
		
		
		
		
		

		
	}
	
	

}
