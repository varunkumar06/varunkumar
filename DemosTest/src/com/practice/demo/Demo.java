package com.practice.demo;


public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DynamicBinding d = new DynamicBinding();
		
		DynamicBinding d1 = new DynamicBindingSubClass1();
		
		DynamicBinding d2 = new DynamicBindingSubClass2();
		
		try {
			System.out.println(d.addition()+"");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			try {
				System.out.println(d1.addition()+"");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
				try {
					System.out.println(d2.addition()+"");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}

}
