package Strings_and_other;

public class reverse_vowels 
{

	public static void main(String[] args) 
	{
		String st= "welcometoscaler";
		reversevowels(st);
	}
	
	public static void reversevowels(String st)
	{
		char[] s= st.toCharArray();
		int i=0;
		int j=s.length-1;
		while(i<j)
		{
//			System.out.println("ok?");
			while(s[i] !='a' && s[i] !='e' && s[i] !='i' && s[i] !='o' && s[i] !='u' )
			{
				i++;
			}
//			System.out.println("ok2");
			while(s[j] !='a' && s[j] !='e' && s[j] !='i' && s[j] !='o' && s[j] !='u' )
			{
				j--;
			}
//			System.out.println("ok3");
			if(i>=j)
			{
				break;
			}
//			System.out.println("ok4");
			char ch = s[i];
			s[i]=s[j];
			s[j]=ch;
//			System.out.println("ok5");
			i++;
			j--;
			
			
		}
		
		for(char ch1:s)
		{
			System.out.print(ch1);
		}
		System.out.println();
		
	}
}
