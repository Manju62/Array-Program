package com.example;

public class HollowTrianglePattern {
    public static void main(String[] args) {
       int row=4;
       
       for(int i=1; i<=row; i++) {
    	   for(int j=i ; j<=row ; j++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1; j<=(2*i -1); j++) {
    		   if(j==1 || j==(2*i-1) || i==row) {
    			   System.out.print("*");
    		   }
    		   else {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
    }
}