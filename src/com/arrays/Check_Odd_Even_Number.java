package com.arrays;

public class Check_Odd_Even_Number {

	public static void main(String[] args) {
		
		int a[]= {10,23,45,32,56,43,78};
		
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2!=0) {
				count++;
				System.out.println(a[i]);
			}
		}
		System.out.println(count);

	}

}
