package com.example;

public class MaxValue {

	public static void main(String[] args) {
		
		int arr []= {23, 45, 24, 2, 76, 555};
		
		int minValue=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <minValue) {
				minValue= arr[i];
			}
		}
		
		System.out.println(minValue);

	}

}
