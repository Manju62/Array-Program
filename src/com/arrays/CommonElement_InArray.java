package com.arrays;

import java.util.HashSet;

public class CommonElement_InArray {

	public static void main(String[] args) {
		int[]a= {3,6,2,8,9};  //2,8
		int []b= {4,5,2,7,8};
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
				}
			}
		}
		for(int no : hs)
			System.out.print(no +" ");

	}

}
