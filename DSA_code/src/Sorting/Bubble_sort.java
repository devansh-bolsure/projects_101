package Sorting;

import java.util.*;

public class Bubble_sort 
{
	public static void main(String[] args) 
	{
		int[] arr= {4,6,8,3,9,-1,5,2};
		Bubblesort(arr);
	}
	
	public static void Bubblesort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)  //i= iteration number
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int val:arr)
		{
			System.out.print(val);
		}
	}
}
