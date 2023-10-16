package Sorting;

public class Insertion_sort 
{
	public static void main(String[] args) 
	{
		
		int[] arr= {3,10,6,2,4};
		insertionsort(arr);
	}
	
	public static void insertionsort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int key= arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				System.out.println(arr[j+1]);
				arr[j+1]=arr[j];
				System.out.println(arr[j+1]+" ");
				j--;
			}
			arr[j+1]=key;
//			System.out.println(arr[j+1]);
			
		}
//		for(int val:arr)
//		{
//			System.out.print(val+" ");
//		}
	}

}
