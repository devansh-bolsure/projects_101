package Arrays;

import java.util.*;

public class removeEven 
{

	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list= new ArrayList<>();
		list.add(4);
		list.add(13);
		list.add(6);
		list.add(79);
		list.add(78);
		list.add(90);
		list.add(99);
		list.add(7);
		list.add(2);
		
		RemoveEven(list);
		
		System.out.println(list);
		
	}
	
	public static void RemoveEven(ArrayList<Integer> list)
	{
		for(int i=list.size()-1;i>=0;i--)
		{
			if(list.get(i)%2==0)
			{
				list.remove(i);
			}
		}
	}
}
