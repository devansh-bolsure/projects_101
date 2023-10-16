package Stacks_and_other;

import java.util.*;

public class priorityqueue 
{
	public static void main(String[] args) 
	{
		
//		PriorityQueue<Integer> pq= new PriorityQueue<>();
		//or
		Queue<Integer> pq= new PriorityQueue<>();
		
		pq.offer(57);
		pq.offer(48);
		pq.offer(20);
		pq.offer(39);
		pq.offer(9);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
	}

}
