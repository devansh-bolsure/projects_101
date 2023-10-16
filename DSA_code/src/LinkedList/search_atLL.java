package LinkedList;

public class search_atLL 
{

	public static class Node
	{
		int data;
		Node next;
		
		Node(int val)
		{
			this.data=val;
		}
	}
	
	
	public static void main(String[] args)
	{
		Node n1= new Node(10);
		Node n2= new Node(20);
		Node n3= new Node(30);
		Node n4= new Node(40);
		Node n5= new Node(50);
		
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		Node head= n1;
		
		searchatLL(head,80);
		
//		Node temp=head;
//		
//		while(temp!=null)
//		{
//			System.out.println(temp.data+"");
//			temp=temp.next;
//		}
		
	}
	
	static void searchatLL(Node head,int k)
	{		
		Node temp=head;
		
		while(temp!=null)
		{
			if(temp.data==k)
			{
				System.out.println(true);
				break;
				
			}
			temp=temp.next;
		}
		
		if(temp==null)
		{
			System.out.println(false);
		}
		
		
		
	}
}
