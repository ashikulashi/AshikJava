package org.sample;

public class Sample {
	
	public static int a;
	
	private void add() {
		a=100;
		
		System.out.println("a in method "+a);

	}
	
	public static void main(String[] args) {
		
		System.out.println("before obj "+a);
		
		Sample s=new Sample();
		s.add();
		System.out.println("after method calling "+a);
		
		Sample s1=new Sample();
		
		System.out.println("bef new obj "+a);
		
	}
}
