package Stacks_and_other;

import java.util.*;

public class Kth_Largest 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,1,4,7,2,13,3};
		int k=3;
		
		K_Largest(arr,k);
	}
	
	public static void K_Largest(int[] arr,int k)
	{
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		 int i=0;
		 while(i<k)
		 {
			 pq.add(arr[i]);
			 i++;
		 }
		 
		 while(i<arr.length)
		 {
			 if(arr[i]>pq.peek())
			 {
				 pq.remove();
				 pq.add(arr[i]);
			 }else
			 {
				 //do Nothing
			 }
			 
			 i++;
			 			 			 
		 }
		 
//		 System.out.println(pq.remove());
		 
		 while(pq.size()>0)
		 {
			 System.out.println(pq.remove());
		 }
	}

}
