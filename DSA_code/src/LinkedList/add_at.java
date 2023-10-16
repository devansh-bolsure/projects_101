package LinkedList;


public class add_at 
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
			
			head= addat(head, 60,3);
			
			Node temp=head;
			
			while(temp!=null)
			{
				System.out.println(temp.data+"");
				temp=temp.next;
			}
				
			
		}
		
		static Node addat(Node head,int val,int idx)
		{
//			
//			if(head==null)
//			{
////				addfirst(val;)
//			}
			
			
			Node n= new Node(val);
			
			Node temp= head;
			int k=3;
			
			for(int i=1;i<=k-1;i++)   //k is given  
			{
				 temp=temp.next;
				
			}
			
			Node tempp1=temp.next;
			
			temp.next=n;
			n.next=tempp1;
			
			return head;
		}
	
	
	
	
}
