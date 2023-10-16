package Stacks_and_other;
import java.util.*;


public class LearnMap 
{

	public static void main(String[] args) 
	{
		
//		Map<String, Integer> numbers = new HashMap<>();
		Map<String, Integer> numbers = new TreeMap();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three",3);
		numbers.put("Four", 4);
		numbers.put("Five", 5);
		
		System.out.println(numbers);
		
		//putIfAbsent
		
		numbers.putIfAbsent("Two", 23);
		
		//map.Entry
		
//		for(Map.Entry<String,Integer> e:numbers.entrySet())
//		{
//			System.out.println(e);
//			
//			System.out.println(e.getKey());
//			
//			System.out.println(e.getValue());
//		}
		
		for(String key: numbers.keySet())
		{
			System.out.println(key);
		}
	
		for(int value: numbers.values())
		{
			System.out.println(value);
		}
		
		//containskey,containsvalue,isempty,clear,remove funtions
	}
}
