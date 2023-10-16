package Stacks_and_other;

import java.util.*;
import java.lang.*;

public class Queue_class 
{

	public static void main(String[] args) 
	{
		
		Queue<Integer> queue=new ArrayDeque<>();
		
		//add
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(25);
		
		// we get next element that can be removed
		
//		System.out.println(queue.peek());
		
		
		//pole removes first element 
		System.out.println(queue.poll());
		System.out.println(queue);
		
		
//		queue.remove();
//		queue.size();
	}
}
