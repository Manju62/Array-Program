package com.arrays;

public class FirstDuplicate_Elements {

	public static void main(String[] args) {

		int a[]= {4,10,10,23,23,56};
		int temp=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j] && i!=j) {
					temp=temp+1;
					System.out.println(a[i]);
					break;
				}
			}
			if(temp>0) {
				break;
			}
				
	}
	}
}
