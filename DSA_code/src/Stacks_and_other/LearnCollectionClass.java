package Stacks_and_other;

import java.util.*;

public class LearnCollectionClass 
{

	public static void main(String[] args) 
	{
		
		List<Student> list= new ArrayList<>();
		
//		list.add(199);
//		list.add(39);
//		list.add(47);
//		list.add(78);
//		list.add(99);
//		list.add(199);
//		
//		System.out.println("min element:"+Collections.min(list));
//		System.out.println("max element:"+Collections.max(list));
//		System.out.println("frequency element:"+Collections.frequency(list,199));
//		
//		Collections.sort(list,Comparator.reverseOrder());
//		
//		System.out.println(list);
		
		

		list.add(new Student("Anuj", 2));
		list.add(new Student("Ramesh", 4));
		list.add(new Student("Suresh", 7));
		list.add(new Student("Manoj", 3));
		
		Student s1= new Student("Anuj", 2);
		Student s2= new Student("Manoj",3);
		
		System.out.println(list);
		
		Collections.sort(list,new Comparator<Student>()
		{
			@Override
			
			public int compare(Student o1,Student o2)
			{
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println(list);
	}
}
