package Sorting;

import java.util.*;
import java.util.Collections;

public class Arrays_sort 
{
	public static void main(String[] args) {
		
		int[] arr= {7,3,10,2,5,9,16,1};
		List<Integer> list= new ArrayList<>();
	
		Arrays.sort(arr);//uses double pivoted quick sort O(nlogn) but qorst case O(n**2) dont use in codechef
		
		Collections.sort(list);//worst case O(logn)--Uses merge sort
		
	}

}
