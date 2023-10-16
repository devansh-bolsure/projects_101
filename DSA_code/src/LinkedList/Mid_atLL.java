package LinkedList;


public class Mid_atLL 
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
		Node n6= new Node(60);
		Node n7= new Node(70);
		
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		
		Node head= n1;
		
		midatLL(head);
		
//		Node temp=head;
//		
//		while(temp!=null)
//		{
//			System.out.println(temp.data+"");
//			temp=temp.next;
//		}
		
	}
	
	public static void midatLL(Node head)
	{		
		Node temp=head;
		
		Node s=temp;
		Node f=temp;
		
		while(f.next!=null )
		{
			 s=s.next;
			 f=f.next.next;
			 
		}
				
		System.out.println(s.data);
		
	}
	
}
