package com.practice.demo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s1 = "Lucy";
		String s2 = new String("Lucy");
		String s3 = "Lucy";
		System.out.println(s3);
		s3 = s3.concat("wow");
		System.out.println(s3);
		String s4 = s2;
		System.out.println("S1 :" + s1.hashCode());
		System.out.println("S2 :" + s2.hashCode());
		System.out.println("S3 :" + s3.hashCode());
		
		System.out.println("Check :" + s1.equals(s2));
		System.out.println("Check :" + s1.equals(s3));
		System.out.println("Check :" + s2.equals(s3));
		System.out.println("Check :" + s4.equals(s2));
		
		System.out.println( s1==s2);
		System.out.println( s1==s3);
		System.out.println( s2==s3);
		System.out.println( s4==s2);
		
		 int j = 5;
		  for (int i = 0; i< j; i++)
		  {
		    if ( i < j-- )
		       System.out.print(  (i*j)  + " ");
		  }
		
	}

}
