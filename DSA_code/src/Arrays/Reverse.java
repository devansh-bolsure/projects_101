package Arrays;

import java.util.*;

public class Reverse {
	
	public static void main(String[] args) 
	
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
//		System.out.println("ok");
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]= i+1;
		}
		int i= 0;
		int j=n-1;
		
		while(i<j)
		{
//			arr[i]=arr[j];
//			arr[j]=arr[i];// Mirrors each other
			
			int temp=arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
			
		}
		
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
		
		
		
	}

}
