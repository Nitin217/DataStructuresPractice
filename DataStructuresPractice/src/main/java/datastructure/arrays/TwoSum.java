package main.java.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/*
	 * Given an array of integers, return indices of the two numbers such that they
	 * add up to a specific target.
	 * 
	 * You may assume that each input would have exactly one solution, and you may
	 * not use the same element twice.
	 * 
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */
	
	static void twoSumBrute(int[] array1, int target) {
		if (array1 == null || array1.length == 0) {
			System.out.println("Provide array");
		} else {
			for (int i = 0; i < array1.length; i++) {
				for (int j = 1; j < array1.length; j++) {
					if (array1[i] == target - array1[j]) {
						System.out.println(i + " , " + j);
						break;
					}
				}
			}
		}

	}
	
	static void twoSum(int[] array1, int target) {
		if (array1 == null || array1.length == 0) {
			System.out.println("Provide  array");
		}else {
			Map<Integer, Integer> intMap=new HashMap<>();
			for (int i = 0; i < array1.length; i++) {
				intMap.put(array1[i], i);
			}
			/*
			 * for (int i = 0; i < array1.length; i++) { int leftNum=array1[i]; int
			 * rightNum=array1[array1.length-1]; if(leftNum<=target && rightNum<= target &&
			 * leftNum+rightNum==target) { System.out.println("Found :"+array1[i]+
			 * " at index- "+i+" and "+array1[array1.length-i]+" at index-"+(array1.length-i
			 * )); }else if(leftNum<=target) {} }
			 */
			
			for (int i = 0; i < array1.length; i++) {
				int complement=target-array1[i];
				if(intMap.containsKey(complement) && intMap.get(complement) != i) {
					System.out.println(i+" "+intMap.get(complement));
				}
			}
		}
		
	}


}
