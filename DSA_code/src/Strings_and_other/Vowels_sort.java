package Strings_and_other;

public class Vowels_sort 
{
	
	public static void main(String[] args) 
	{
		String st="welcometoearth";
		
		removevowels(st);
		
	}
	
	public static void removevowels(String st)
	{
		for(int i=0;i<st.length();i++)
		{
			char ch= st.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				continue;
			}
			
			System.out.print(ch);
		}
	}

}
