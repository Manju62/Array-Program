package com.arrays;

public class NullPointException {
	
	//String s=null;
	public static void main(String[] args) {
		int a=1;
		int b=1;
		try {
		int data=25/0;
	//	System.out.println(a);
		System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println(a);
			System.out.println(e);
		}
		
		finally {
			System.out.println("Manju");
			System.out.println(b);
		}
	}

}
