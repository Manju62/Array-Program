package com.arrays;

import java.util.Scanner;

public class Second_Maxm_Element {

	public static void main(String[] args) {
		
	//	int a[]= {45,56,47,34,78,56,42};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scanner.nextInt();
		int a[]= new int[size];
		
		System.out.println("ENter the array elements");
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextInt();
		}
		
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
				}
		}
	}
		
		System.out.println(a[0]);
		
		
		int temp1;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
				temp1=a[i];
				a[i]=a[j];
				a[j]=temp1;
			}
		}
	}
		System.out.println(a[0]);
	}

}
