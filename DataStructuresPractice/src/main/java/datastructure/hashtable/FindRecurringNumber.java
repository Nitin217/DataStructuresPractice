package main.java.datastructure.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class FindRecurringNumber {
	
	private static Map<Integer, Integer> input;

	//Google Question
	//Given an array = [2,5,1,2,3,5,1,2,4]:
	//It should return 2

	//Given an array = [2,1,1,2,3,5,1,2,4]:
	//It should return 1

	//Given an array = [2,3,4,5]:
	//It should return undefined
	
	
	static void firstRecurringNumber (int[] array) {
		input = new Hashtable<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			if(input.containsKey(array[i])) {
				System.out.println("Number recurred : "+ array[i]);
				break;
			}else {
				input.put(array[i], array[i]);
			}
			if(i==array.length-1) {
				System.out.println("Not found");
			}
		}
		
	}
	
	//Given an array = [2,1,1,2,3,5,1,2,4]:
	//It should return 2
	
	static void firstRecurringNumber2(int[] array) {
		input = new Hashtable<Integer, Integer>();
		for(int i=0;i<array.length;i++) {
			if(input.containsKey(array[i])) {
				System.out.println("Number recurred : "+ array[i]);
				break;
			}else {
				input.put(array[i], array[i]);
			}
			if(i==array.length-1) {
				System.out.println("Not found");
			}
		}
		
	}

}
