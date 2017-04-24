/**
 * 
 */
package com.mycompany.ass3.chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kathleen Falcon
 *
 */
public class Exp7_HelloArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
			// declarations
			List<String>  strings;
			List<Integer> integers;
			
			// initializations - do not need to set a size (like we do with arrays). 
			// its size is dynamic.
			strings = new ArrayList<String>();
			integers = new ArrayList<Integer>();
			
			// declaration and initialization together
			List<Integer> integers2 = new ArrayList<Integer>();
			// collections are generic interfaces and classes
			//hence they operate on Class not primitive.
			//List<int> integers2b = new ArrayList<int>();	//SO THIS IS WRONG
			
			// start filling up ArrayList instances
			// fill up 'strings' and play with it
			strings.add("Kathleen");	// NOTE using "add"
			strings.add("Falcon");
			strings.add(0, "Ms.");	// NOTE added at 0th index. Otherwise it would have been added at 2nd index
			System.out.println("strings:" + strings);	// prints [Ms., Kathleen, Falcon]
			System.out.println("Do strings contains 'ilker':" + strings.contains("ilker"));	// NOTE using "contains"
			System.out.println("index of 'kiris' in strings:" + strings.indexOf("kiris"));	// NOTE using "indexOf"
			System.out.println("element at 1st index of strings:" + strings.get(1));		// NOTE using "get"	
			System.out.println("strings has " + strings.size() + " elements");				// NOTE using "size"
			
			// use for loop to fill up 'integers' and play with it
			for (int i = 0; i < 5; i++)
				integers.add(i);
			
			//print integers list
			System.out.println("integers:" + integers);
			
			// for each loop over the List<T>
			int index = 0;
			for (Integer integer : integers)
				System.out.println(index++ + "th element of integers:" + integer);
			
			// fill up integers2 and play with it
			integers2.addAll(integers);
			
			System.out.println("AFTER adding all of integers to integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4]
			
			//converting an array to ArrayList, and adding that ArrayList to integers2
			Integer[] intArray = {5, 6, 7, 8, 9, 100, 200};
			@SuppressWarnings("unused")
			List<Integer> fixedSizeListBackedByArray = Arrays.asList(intArray);	//updates using fixedSizeListBackedByArray, writes on to intArray
			integers2.addAll(Arrays.asList(intArray));		// using Arrays.asList
			
			//can not use int[], need Integer[]
			//int[] intArray2 = {50,60,70,80,90,100,200};
			//integers2.addAll(Arrays.asList(intArray2));		// WRONG
			
			System.out.println("AFTER adding all elements of intArray to integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 200]
			System.out.println("size of integers2:" + integers2.size());	//prints 12
			
			integers2.remove(new Integer(200));	//using "remove" a specific element
			System.out.println("AFTER removing 100 from integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100]
			
			integers2.remove(10);	// NOTE using "remove" at an index
			System.out.println("AFTER removing 100 at the 10th index from integers2, integer2:" + integers2);	// prints [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
			
			integers2.clear();	// NOTE using "clear"
			System.out.println("AFTER clearing integers2, integer2:" + integers2);	// prints []

	}

}
