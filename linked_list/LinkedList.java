package linked_list;

public class LinkedList {
	Node head;
	public void add(int data)
	{
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public void delete(int pos)
	{
		Node temp=head;
		int counter=0;
		while(temp.next!=null)
		{
			counter++;
			
			if(counter==pos-1)
			{
				Node temp1=temp;
				Node temp2=temp.next;
				Node temp3=temp2.next;
				temp1.next=temp3;
				print();
			}
			temp=temp.next;
			
		}
	}
	
	
	
	public void reverseLinkedList()
	{
		Node prev=null;
		Node next=null;
		while(head!=null)
		{
			next=head.next;
			head.next=prev;
			prev=head;
			head=next;
			
		}
		head=prev;
		
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("Nothing to display");
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
				
			}
			System.out.println(temp.data);
		}
	}

}
