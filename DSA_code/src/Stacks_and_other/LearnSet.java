package Stacks_and_other;

import java.util.*;

public class LearnSet 
{

	public static void main(String[] args) 
	{
		
		Set<Student> studentset = new HashSet<>();
		
		studentset.add(new Student("Anuj", 2));
		studentset.add(new Student("Ramesh", 4));
		studentset.add(new Student("Suresh", 7));
		
		studentset.add(new Student("Manoj", 2));
		
		Student s1= new Student("Anuj", 2);
		Student s2= new Student("Manoj",2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(studentset);
		
		
//		Set<Integer> set= new HashSet<>();////operations are done "O(n)"
//		Set<Integer> set= new LinkedHashSet(); ////orders elements in order of when added
//		Set<Integer> set= new TreeSet(); ////sorts elements and maintains set and operations are done "O(Logn)"

			
//		set.add(20);
//		set.add(32);
//		set.add(39);
//		set.add(59);
//		set.add(21);
//		
//		System.out.println(set);
//		
//		//remove returns true or false value
//		// and we remove given value
//		set.remove(39);
//		System.out.println(set);
//		
//		//contains checks if set has given value or not
//		//and returns true or false
//		System.out.println(set.contains(21));
//		
//		//isEmpty
//		System.out.println(set.isEmpty());
//		
//		//size
//		System.out.println(set.size());
//		
//		//clear
//		set.clear();
//		System.out.println(set);
		

	}
}
