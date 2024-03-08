package com.arrays;

public class NullPonterException1 {

	public static void main(String[] args)  {
//		try {
//			
//		get(null);
//		}
//		catch(NullPointerException e){
//			System.out.println(e);
//		}
//		
//	//	get(null);
//		
//	}
//		public static void get(String s) {
//			System.out.println(s.length());
//		
		try {
		String s1=null;
		int length=s1.length();
		System.out.println(length);
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
	}

}
