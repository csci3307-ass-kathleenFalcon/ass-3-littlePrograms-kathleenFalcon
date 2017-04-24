/**
 * 
 */
package com.mycompany.ass3.chapter7;

import java.util.Arrays;

/**
 * @author Kathleen Falcon
 *
 */
public class Exp7_HelloArray {
	
	public static class SomeClass {
		private String name;
		public SomeClass(String _name) {
			name = _name;
		}
		@Override
		public String toString() {
			return "name: " + name;
		}
	}
	
	
	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//2 ways to declare an array
		int[] intArray1;
		int intArray2[];
		
		//allocating static memory 
		intArray1 = new int[3];			// CORRECT
		intArray2 = new int[10];		// CORRECT
		//int Array2 = new int[];		// WRONG
		
		//same thing but in 1 line
		int[] Array3 = new int[5];
		
		//initialize elements
		intArray1[0] = 101;
		intArray1[1] = 102;
		intArray1[2] = 103;
		
		//initialize elements via for loop
		for (int i = 0; i < 10; i++)
			intArray2[i] = 201 + i;
		
		//array of float values
		Float[] floatArray = {301f, 302f, 303f, 304f, 305f};
		
		//primitive and Class type arrays
		int[] intArray4 = {401, 402};
		Integer integerArray[];
		SomeClass[] someClassArray = {new SomeClass("one"),new SomeClass("two")};
		
		//printing elements of array via Arrays
		System.out.println("intArray1 print the memory address:" + intArray1);						 // prints; intArray1:[I@15db9742
		System.out.println("intArray1 print via Arrays.toString:" + Arrays.toString(intArray1));	 // prints; [101, 102, 103]
		System.out.println("floatArray print via Arrays.toString:" + Arrays.toString(floatArray));	 // prints; [301.0, 302.0, 303.0, 304.0, 305.0]
		System.out.println("someClassArray via Arrays.toString:" + Arrays.toString(someClassArray)); // prints; [name:one, name:two]
		
		//passing an array by reference and changing values via method
		String[] names = {"ilker", "john"};
		System.out.println("BEFORE names:" + Arrays.toString(names));	// prints; [ilker, john]
		strArrayPassedByReference(names);
		System.out.println("AFTER names:" + Arrays.toString(names));		// prints; [ilkerMR, johnMR]
		
		//if method recreates the array, then it will not work on passed reference array
		System.out.println("BEFORE names:" + Arrays.toString(names));	// prints; [ilkerMR, johnMR]
		strArrayPassedByReference_WRONG(names);
		System.out.println("AFTER names still same as before:" + Arrays.toString(names));		// prints; [ilkerMR, johnMR]
		
		// multi-dimensional arrays
		// declare and allocate memory for 2D array
		int twoDimensionalIntArray[][] = new int[2][3];
		twoDimensionalIntArray[0] = new int[3];
		
		// set values of elements of 0th array element of 2D array
		twoDimensionalIntArray[0][0] = 10;
		twoDimensionalIntArray[0][1] = 20;
		twoDimensionalIntArray[0][2] = 30;
		
		// set value of 1st array element of 2D array
		int[] intArray5 = {100,200,300};
		twoDimensionalIntArray[1] = intArray5;
		System.out.println("twoDimensionalIntArray is " + Arrays.deepToString(twoDimensionalIntArray));	// NOTE using "Arrays.deepToString" for multi dimensional array. Prints [[10, 20, 30], [100, 200, 300]]

		//foreach loop
		String[] spanishNumbers = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
		for (String spanishNumber : spanishNumbers) {
			System.out.println("spanishNumber:" + spanishNumber);
		}
		
		//calls average function down below
		double averageOfNumbers = average(1, 2, 3, 4, 5);
		System.out.println("averageOfNumbers:" + averageOfNumbers);
	}
	
	//correct way to change array passed by reference
	private static void strArrayPassedByReference(String[] _names) {
		for (int i = 0; i < _names.length; i++) {
			_names[i] += "MR";
		}
	}

	//INCORRECT way, should not remake the array, it won't change passed array
	private static void strArrayPassedByReference_WRONG(String[] _names) {
		_names = new String[_names.length];
		for (int i = 0; i < _names.length; i++) {
			_names[i] += "DR";
		}
	}
	
	//foreach loop
	public static double average(double ... numbers) {
		double total = 0d;
		
		for (double number : numbers) {
			total += number;
		}
		
		return total / numbers.length;
		

	}

}
