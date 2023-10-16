package Arrays;
import java.util.*;

public class Constructor_overloading 
{
	
	int id;
	String name;
	int age;
	
	Constructor_overloading(int i,String n)
	{
		id = i;
		name = n;
	}
	
	Constructor_overloading(int i,String n,int a)
	{
		id = i;
		name = n;
		age = a;
	}
	
	void display() { System.out.println(id+" "+name+" "+age);}
	
	public static void main(String[] args) 
	{
		Constructor_overloading co= new Constructor_overloading(21,"paypal");	
		Constructor_overloading co1= new Constructor_overloading(21,"paypal",23);	
		co.display();
		co1.display();
		
	}

	
}
