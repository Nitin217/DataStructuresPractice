package main.java.datastructure.arrays;

public class ArrayMain {

	public static void main(String[] args) {
		ReverseString.reverseString("Hello Preeti and Advit!");
		ReverseString.reverseString(null);
		MergeSortedArrays.mergeSortedArrays(new int[] {1,5,7}, new int[] {2,4,9});
		TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
		//TwoSum.twoSumBrute(new int[] {2, 11,7, 15}, 9);
	}

}
