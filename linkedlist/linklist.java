package linkedlist;

public class linklist {
	Node head;
	
	public class Node { 
		public int data;
	   Node next;
	}
	
	public void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head == null) {
			head=node;
		//	System.out.println("insearted"+data);
		}
		else
		{
			Node check=head;
			while(check.next!=null) {
				check=check.next;
			}
			check.next=node;
			
		//System.out.println("insearted"+data);
		}
	}
	public void display() {
		Node node =head;
		while(node!=null) {
			System.out.println(node.data);
			node=node.next;
			
		}
	
	//System.out.println(node.data);
	}
	public void deleat(int number) {
		if(number==1) {
			head=head.next;
		}
		
	}

}
