package Hashmap;

import java.util.*;

public class Hashmap_Intro 
{

	public static void main(String[] args) 
	{
		String st= "aabdabcdbacbd";
		
		Maxfreq(st);
		
	}
	
	
	public static void Maxfreq(String st)
	{
		HashMap<Character, Integer>  fmap = new HashMap<>();
		
		for(int i=0;i<st.length();i++)
		{
			char ch= st.charAt(i);
			
			if(fmap.containsKey(ch)==true)
			{
				int cfreq= fmap.get(ch);
				fmap.put(ch, cfreq+1);
				
			}else
			{
				fmap.put(ch, 1);
			}
		}
		
		int maxval=0;
		char  maxchar='d'; //can be empty as well
		
		for(char c: fmap.keySet())
		{
			if(fmap.get(c)>maxval)
			{
				maxval=fmap.get(c);
				maxchar=c;
			}
		}
		
		System.out.println(maxchar);
		
		System.out.println(fmap.keySet());
	}
}
