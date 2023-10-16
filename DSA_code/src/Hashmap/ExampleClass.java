package Hashmap;

import java.io.*;
import java.util.Arrays;

public class ExampleClass 
{
//	public static int count = 0;
//	public int id;
//
//	public ExampleClass() {
//		count++;
//		this.id = count;
//	}
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
//	
//
//	public static void printCount() {
//		System.out.println("Number of instances: " + count);
//	}
//
//	public void printId() {
//		System.out.println("Instance ID: " + id);
//	}
//
//	public static void main(String[] args) {
//		ExampleClass e1 = new ExampleClass();
//		ExampleClass e2 = new ExampleClass();
//		ExampleClass e3 = new ExampleClass();
////		ExampleClass e4 = new ExampleClass();
//
//		
//
//		e1.printId();
//		e2.printId();
//		e3.printId();
//
//		ExampleClass.printCount();
//	}

	// Java program to find unique
	// element in matrix

	


		// function that calculate unique element
		static void unique(int[][] mat, int n, int m)
		{
			int maximum = 0, flag = 0;
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{
					// Find maximum element in
					// a matrix
					if (maximum < mat[i][j]) 
					{
						maximum = mat[i][j];
					}
				}
			}
			
			System.out.println(maximum);

			// Take 1-D array of (maximum + 1)
			// size
			int[] b = new int[maximum + 1];
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{
					int y = mat[i][j];
					b[y]++;
					
				}
			}
			System.out.print(Arrays.toString(b));
			
			// print unique element
			for (int i = 1; i <= maximum; i++) 
			{
				if (b[i] == 1) 
				{
					System.out.print(i + " ");
				
					flag=1;
				}
			}
			

			if (flag == 0) 
			{
				System.out.print(
					"No unique element in the matrix");
			}
		}

		public static void main(String[] args)
		{
			int R = 4, C = 4;
			int[][] mat = { { 1, 1, 3, 3 },
							{ 5, 5, 25, 25 },
							{ 1, 3, 5, 6 },
							{ 6, 8, 11, 10} };

			// function that calculate unique element
			unique(mat, R, C);
		}
	

	





}

