package Stacks_and_other;

import java.util.*;

///Reversing first K elements

public class Reverse_queue 
{
	public static void main(String[] args) 
	{
		
		Queue<Integer> queue=new ArrayDeque<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		int k=3;
		
		reverse(queue,k);
	}
	
	public static void reverse(Queue<Integer> queue,int k)
	{
		
		Stack<Integer> st = new Stack<>();
		
		for (int i=0;i<k;i++)
		{
			st.push(queue.remove());
		}
		
//		System.out.println(st.peek());
		
		for(int i=0;i<k;i++)
		{
			queue.offer(st.pop());
		}
		
		int count= queue.size()-k;
		
		
		
		for(int i=0;i<count;i++)
		{
			System.out.println(queue);
			queue.offer(queue.remove());
			
			System.out.println(queue);
		}
		
//		System.out.println(queue);
	}
}
