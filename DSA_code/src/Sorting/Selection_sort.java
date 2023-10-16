package Sorting;

import java.util.*;

public class Selection_sort 
{

	public static void main(String[] args)
	{
		int[] arr= {-1,2,0,8,16,-3,7,9};
		
		Selectionsort(arr);
	}
	
	public static void Selectionsort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int minval= arr[i];
			int minidx= i;
			
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<minval)
				{
					minval= arr[j];
					minidx= j;
				}	
			}
			int temp= arr[i];
			arr[i]=arr[minidx];
			arr[minidx]=temp;
			
		}
		for(int val:arr)
		{
			System.out.println(val);
		}
	}
}
