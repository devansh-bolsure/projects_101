package Strings_and_other;


import java.util.*;

import Arrays.arrayList_iterator;

public class excercise {
	
	public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String A=sc.nextLine();
        int B=sc.nextInt();
        solve(A,B);

    }
    
    public static void solve(String A, int B) 
    {
       
        String[] s= A.split("");
        
        List<String> list=new ArrayList<>(Arrays.asList(s));

        int i=0;
        int j=1;
        int count=1;
        if(s[i]==s[j])
        {
            count+=1;
            if(count==B)
            {
               for(int x=i;x<j+1;x++)
               {
            	   list.remove(x);
               }
            	  
            }
            i++;
            j++;
        }
        
        System.out.println(list);
        
		
		
        
//		You are given a string A of size N.
//
//		Return the string A after reversing the string word by word.
//
//		NOTE:
//
//		A sequence of non-space characters constitutes a word.
//		Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
//		If there are multiple spaces between words, reduce them to a single space in the reversed string.

    }

}
