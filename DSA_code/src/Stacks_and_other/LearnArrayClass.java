package Stacks_and_other;

import java.util.*;

public class LearnArrayClass 
{
	public static void main(String[] args) 
	{
//		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
//		
//		int index = Arrays.binarySearch(numbers,4);
//		System.out.println("The index of number 4 is "+index);
		
		int [] numbers= {12,46,89,99,1,0,100,118,21,49};
		
		Arrays.sort(numbers);
		
		for (int i: numbers)
		{
			System.out.print(i+" ");
		}
		
		//fill= fills array with gives number
		
		Arrays.fill(numbers, 12);
		
		for (int i: numbers)
		{
			System.out.println(i+" ");
		}
	}
}
