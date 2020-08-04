package main.java.datastructure.arrays;

public class TwoSum {

	/**
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
	
	static void twoSumMySolution(int[] array1, int target) {
		if(array1==null || array1.length==0) {
			System.out.println("Provide int array");
		}else {
			for(int i=0;i<array1.length;i++) {
				for(int j=1;j<array1.length;j++) {
					if(array1[i]<=target && array1[j]<=target && array1[i]+array1[j]==target) {
						System.out.println(i+ " , "+j);
						break;
					}
				}
				
			}
		}
		
	}


}
