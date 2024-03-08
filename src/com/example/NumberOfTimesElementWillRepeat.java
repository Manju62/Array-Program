package com.example;

public class NumberOfTimesElementWillRepeat {
	    public static void main(String[] args) {  
	        
	        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
	         
	        int [] repeated = new int [arr.length];  
	        
	        int visited = -1;  
	        for(int i = 0; i < arr.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < arr.length; j++){  
	                if(arr[i] == arr[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    repeated[j] = visited;  
	                }  
	            }  
	            if(repeated[i] != visited)  
	                repeated[i] = count;  
	        }  
	  
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------------------------");  
	        for(int i = 0; i < repeated.length; i++){  
	            if(repeated[i] != visited)  
	                System.out.println("    " + arr[i] + "    |    " + repeated[i]);  
	        }  
	        System.out.println("----------------------------------------");  
	    }}  