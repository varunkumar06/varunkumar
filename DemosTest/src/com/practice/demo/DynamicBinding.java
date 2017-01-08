package com.practice.demo;


public class DynamicBinding {
	
	public int addition() throws Exception
	{
		return 0;
		
	}
	
	int x = 10; 
	 public void assign(int x)
	 {
	   x = x;  
	   System.out.println(this.x);
	 }
	 public static void main(String[] args)
	 {
	   new DynamicBinding().assign(100);	
	 }
	

}
