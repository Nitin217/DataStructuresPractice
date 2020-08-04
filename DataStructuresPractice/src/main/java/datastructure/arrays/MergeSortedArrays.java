package main.java.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {
	static void mergeSortedArrays(int[] array1,int[] array2) {
		if(array1==null || array2==null || array1.length==0 || array2.length==0) {
			System.out.println("Array needs to have elements");
		}else {
			int[] outarray=new int[array1.length+array2.length];
			int count=0;
			for(int i=0;i<array1.length;i++) {
				outarray[i]=array1[i];
				count++;
			}
			for(int i=0;i<array2.length;i++) {
				outarray[count+i]=array2[i];
			}
			Arrays.sort(outarray);
			System.out.println(Arrays.toString(outarray));
		}
	}
}
