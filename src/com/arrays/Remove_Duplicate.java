
package com.arrays;

import java.util.HashSet;

public class Remove_Duplicate {

	public static void main(String[] args) {
		
		int a[]= {45,56,47,34,45,56,47,33}; //45, 56, 47,
		
		HashSet<Integer> hs=new HashSet<>();
		
		for(int i=0; i<a.length;i++) {
			hs.add(a[i]);
		}
	//	System.out.println(hs);
		for(int  no:hs) {
			System.out.print(no + " ");
		}

	}

}
