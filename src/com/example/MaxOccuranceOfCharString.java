package com.example;

public class MaxOccuranceOfCharString {

	public static void main(String[] args) {
		
		String str= "manjjuaa";
		
		int arr[] = new int[127];
		
		for(int i=0; i<str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		int visited =-1;
		char ch=' ';
		
		for(int i=0; i<str.length(); i++) {
			if(visited < arr[str.charAt(i)]) {
				visited = arr[str.charAt(i)];
				ch=str.charAt(i);
			}
		}
		System.out.println(ch);
	}

}
