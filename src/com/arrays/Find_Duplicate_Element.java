package com.arrays;

public class Find_Duplicate_Element {

	public static void main(String[] args) {
		
		int a1 []= {10,23,45,10,23};
		
		for(int i=0; i<=a1.length; i++) {
			for(int j=i+1; j<a1.length; j++) {
				if(a1[i]==a1[j] && i!=j) {
					
					System.out.println(a1[i]);
					
				}
			}
		}

	}

}
