package com.arrays;

public class InsertElementinParticularPosition {

	public static void main(String[] args) {
		int a[]= {10,23,45,67};
		int pos=4;
		int element=100;
		
		for(int i=a.length-1; i>pos; i--) {
			a[i]=a[i-1];
		}
		a[pos-1]=element;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
