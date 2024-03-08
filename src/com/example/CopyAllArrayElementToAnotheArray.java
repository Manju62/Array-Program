package com.example;

public class CopyAllArrayElementToAnotheArray {

	public static void main(String[] args) {
		
		int arr1[]= {45,28,23,65,89};
		int arr2[]= new int[arr1.length];
		
		System.out.println("Befor copy array element is:");
		for(int i=0; i<arr1.length; i++) {
			System.out.print( arr1[i] +" ");
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
			
		}
	
		
		System.out.println();
		System.out.println("Copy array elements are:");
		for(int i=0; i<arr2.length; i++) {
			System.out.print( arr2[i] +" ");
		}
	}

}
