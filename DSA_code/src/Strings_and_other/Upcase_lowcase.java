package Strings_and_other;

import java.util.*;

public class Upcase_lowcase 
{
	public static void main(String[] args)
	{
		String st="wElcoMEtoScAleR";
		
		uppertolowercase(st);
	}
	
	
	public static void uppertolowercase(String st)
	{
		
		char[] s= st.toCharArray();
		
		for(int i=0;i<s.length;i++)
		{
			char ch= s[i];
			
			if(ch>='A' && ch<='Z')
			{
				char ansch= (char)(ch-'A'+'a');
				s[i]= ansch;
				
			}
			
		}
		
		for(char c:s)
		{
			System.out.print(c);
		}
	}

}
