package Arrays;

import java.util.*;

public class Rotate 
{
	public static void main(String[] args)
	{
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};		
		rotate(arr);
	} 

	public static void rotate(int[][]arr)
	{
		//lower triangle of a matrix swap-->(i,j)--->(j,i)
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp= arr [i][j];
				arr[i][j]= arr[j][i];
				arr[j][i]=temp;
			}
		}
	
		int n= arr.length;
		int m= arr[0].length;
		for(int i=0;i<n;i++)
		{
			int start=0;
			int end=m-1;
			
			while(start<end)
			{
				int temp= arr [i][start];
				arr[i][start]= arr[i][end];
				arr[i][end]=temp;
				
				start++;
				end--;
			}
		}
		
		for(int i1=0;i1<m;i1++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i1][j]+" ");
			}
			
			System.out.println();
		}
		
	}
	
}
