package com.arrays;

public class ThrowExample {

	public static void main(String[] args) {
		int age=12;
		if(age<18) {
			throw new NullPointerException("not valid");
		}
		else {
			System.out.println("valid");
		}
	}

}
