package org.sample;

public class KVBBank implements IndianBank,CanaraBank {

	@Override
	public void deposit() {
		System.out.println("desposit 5%");
		
	}

	@Override
	public void current() {
		System.out.println("current 4%");
		
	}

	@Override
	public void savings() {
		System.out.println("savings 9%");
		
	}

	@Override
	public void fixed() {
		System.out.println("fixed 8%");
		
	}
	public static void main(String[] args) {
		KVBBank k=new KVBBank();
		k.current();
		k.deposit();
		k.fixed();
		k.savings();
	}

	
	
	

}
