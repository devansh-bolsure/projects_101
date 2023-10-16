package Recusrion;

public class Array_tracing 
{

	public static void main(String[] args) 
	{
		int[] arr= {2,3,6,9,8,3,2,6,2,4};
		int x=4;
		
		System.out.println(printarray(arr,x,0));
		
	}
	
	public static int printarray(int[] arr,int x,int i)
	{
		if(i==arr.length)
		{
			return -1;
		}
		
		if(arr[i]==x)
		{
			return i;
		}else
		{
			int idx= printarray(arr,x,i+1);
			return idx;
		}
		
		
	}
	
}
