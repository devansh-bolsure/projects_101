package Recusrion;

public class Print_increasing 
{

	public static void main(String[] args) 
	{
		printincreasing(10);
		
	}
	
	public static void printincreasing(int N)
	{
		if(N==0) 
		{
			return;
		}
		printincreasing(N-1);
		System.out.println(N);
	}
}
