package Recusrion;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int n=5;
		
		System.out.println(Factorial(n));	
		
	}
	
	public static int Factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int nm1fact= Factorial(n-1);
		return n*nm1fact;
		
		
	}
}
