package Arrays;

import java.util.*;
import java.util.ArrayList.*;

public class arrayList_iterator 
{
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		ArrayList<Integer> list= new ArrayList<>();	
		
		//add
		
		list.add(10);
		list.add(20);
		list.add(30);
		
////		System.out.println(list);
//		
//		//add at indeex
//		
//		list.add(1, 40);;
////		System.out.println(list);
//		
//		//get we get elements of given index
//		System.out.println(list.get(2));
//		
//		//set updates elements
//		list.set(2, 50);
//		System.out.println(list.get(2));
//		
//		//remove
//		list.remove(2);
//		System.out.println(list);
//		
//		
//		//size gives total number of elements not the array size
//		System.out.println(list.size());
//		
		// addAll function add new list 
		ArrayList<Integer> newlist = new ArrayList<>();
//		
		newlist.add(21);
		newlist.add(49);
		
		list.addAll(newlist);
//		
//		System.out.println(list);
//		
//		//remove element directly
//		
//		list.remove(Integer.valueOf(30));
//		
//		System.out.println(list);
//		
//		//clear will remove all elemnets of list
//		
////		list.clear();
////		System.out.println(list);
//		
//		//contains checks if list contains element or not
//		
////		list.contains(49);
//		System.out.println(list.contains(49));
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext())
		{
			System.out.println("iterator:" +it.next());
		}
		
		
	}

}
