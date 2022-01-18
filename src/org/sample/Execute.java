package org.sample;

public class Execute extends Employee {
	
	
	public Execute() {
		
		System.out.println("default constructor");
	}
	
	public Execute(int idNo) {
		System.out.println("int para constructor");
		System.out.println(idNo);
	}
	
	public static void main(String[] args) {
		
		Execute e=new Execute();
		Execute e1=new Execute(3456);
		
		
		
		
	}
	
	
	

}
