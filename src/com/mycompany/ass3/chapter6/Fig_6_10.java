/**
 * 
 */
package com.mycompany.ass3.chapter6;

/**
 * @author Kathleen Falcon
 * 
 */
public class Fig_6_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}
	
	public static int square(int val)
	{
		System.out.printf("%nCalled square with int argument: %d%n", val);
		return val * val;
	}
	
	public static double square(double val)
	{
		System.out.printf("%nCalled square with double argument: %f%n", val);
		return val * val;
	}

}
