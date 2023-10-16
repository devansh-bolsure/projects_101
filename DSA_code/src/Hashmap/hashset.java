package Hashmap;

import java.util.*;

public class hashset 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set= new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		System.out.println(set.contains(10));
		System.out.println(set.contains(15));
		
		set.remove(40);
		
		System.out.println(set.contains(40));
		
		System.out.println(set.size());
		
		set.add(20);
		
		System.out.println(set.size());
	}
}
