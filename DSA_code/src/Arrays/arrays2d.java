package Arrays;

import java.util.*;

public class arrays2d {
	
	public static void main(String[] args) {
		
		int[][] arr= new int[5][6];
		
		//sets
		
		arr[1][3]=10;
		
		
		//get
		System.out.println(arr[1][3]);
		System.out.println(arr[2][3]);
		
		//row count
		
		System.out.println(arr.length);
		
		//column count
		
		System.out.println(arr[0].length);
		
		//traversal
		
		for(int i=0;i<arr.length;i++)  //i-->row
		{
			for(int j=0;j<arr[0].length;j++)  //j-->column
			{
				//processing
			}
		}


		
				
		
	}

}
