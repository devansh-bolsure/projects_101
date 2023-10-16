package Recusrion;

public class Print_array_recusrion 
{

	public static void main(String[] args) 
	{
		
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		
		
		printarray(arr,0);
		
	}
	
	public static void printarray(int[]arr,int idx)
	{
		if(idx==arr.length)
		{
			return;
		}
		
		System.out.println(arr[idx]);
		printarray(arr,idx+1);
	}
}
