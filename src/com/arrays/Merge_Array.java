package com.arrays;

public class Merge_Array {

	public static void main(String[] args) {
		
		int a []= {4,5,6,7};
		int b[]= {2,3,6,9};
		
		int c_length = a.length+b.length;
		
		int c[] = new int[c_length];
		
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];
			
		}
		for(int i=0; i<b.length; i++) {
			c[i + a.length]=b[i];
			
		}
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}

}
