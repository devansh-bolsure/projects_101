package Stacks_and_other;

import java.util.*;

public class LearnArrayDeque 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(29);//queue functions
//		System.out.println(adq);
		//arraydeque functions
		adq.offerFirst(39);
		adq.offerLast(99);
		adq.offer(199);
		
		System.out.println(adq);
		
		//peek functions
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		//poll functions
		
		System.out.println(adq.poll());
		System.out.println("poll()"+adq);
		
		System.out.println(adq.pollFirst());
		System.out.println("pollFirst()"+adq);
		
		System.out.println(adq.pollLast());
		System.out.println("pollLast()"+adq);
		
	}
}
