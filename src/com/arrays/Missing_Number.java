package com.arrays;

public class Missing_Number {

	public static void main(String[] args) {
		
		int a[]= {3,4,6,7};
		// calculate expected sum of all the element from 1 to n
		int sum= (a.length+1)*(a.length+2)/2;  
		
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result+=a[i];
			}
		   sum=result-sum;
		
		System.out.println(sum);
	
	}

}
