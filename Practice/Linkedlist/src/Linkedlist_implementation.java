//arraylist is implemented using dynamic array
//tc of insert is O(n) and search is O(1)
//linkedlist has non contiguous memory location
//insert - tc=O(1) (use case) : less time than arraylist
//search - tc=O(n) and we have to traverse whole ll : more time than arraylist

public class Linkedlist_implementation {
	
	Node head;
	private int size;
	public Linkedlist_implementation() {
		// TODO Auto-generated constructor stub
		
		this.size=0 ; //initial value
	}
	class Node
	{
		int data;
		Node next; //next reference
		
		//constructor for new node creation 
		Node(int data)
		{
			this.data=data;
			this.next=null;
			size++;
		}
	}
	//add at first of ll
	public void addfirst(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			//empty list , make head as newnode
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	
	//add at last of ll
	public void addlast(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			//empty list , make head as newnode
			head=newnode;
			return;
		}
		//else
		Node currnode=head; //current node created as head gets updated and head first point disappears
		while(currnode.next!=null)
		{
			//traversing ll
			currnode=currnode.next;   //last node found
			
		}
		currnode.next=newnode;
	}
	
	//insert node in middle
	public void insertatindexi(int index,int data)
	{
		if(index>size || index<0)
		{
			System.out.println("invalid index value");
			return;
		}
		size++;
		Node newnode=new Node(data);
		if(head==null || index==0)
		{
			newnode.next=head;
			head=newnode;
			return;
		}
		Node currnode=head; //currnode created
		for(int i=1;i<size;i++)
		{
			if(i==index)
			{
				Node nextnode=currnode.next;
				currnode.next=newnode;
				
				newnode.next=nextnode;
				break;
				
			}
			//traversing list
			currnode=currnode.next;
		}
	}
	
	//print list
	public void printlist()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		Node currnode=head; //current node created as head gets updated and head first point disappears
		while(currnode!=null)  //no .next as we need to print last ele too
		{
			System.out.print(currnode.data+"->");
			//traversing ll
			currnode=currnode.next;   //last node found
			
		}
		System.out.println("NULL"); //last node
		
	}
	//delete first
	public void deletefirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return ;
		}
		size--;
		//traversing list
		head=head.next;
		
	}
	//delete node from last
	public void deletelast()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return ;
		}
		//only one node
		size--; //written here as we will jump over next statement
		if(head.next==null)
		{
			head=null;
			return;
		}
		Node secondlast=head; //traversing from first node
		Node lastnode=head.next; //to that points to head
		//corner case: if head.next=null then lastnode=null
		while(lastnode.next!=null)
		{
			//last node encountered
			lastnode=lastnode.next;
			secondlast=secondlast.next;
		}
		//deleting the last nodes
		secondlast.next=null;
	}
	
	public int getsize()
	{
		return size;
	}
    
	//reversing the linked list
	public void reverse_iterate()
	{
		//list is empty
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		//single node in list
		if(head.next==null)
		{
			//list is already reversed
			return;
		}
		Node prevnode=head; //starting treversing from head
		Node currnode=head.next;
		while(currnode!=null)
		{
			//as currnode will be null if it is last node
			Node nextnode=currnode.next; 
			currnode.next=prevnode; //pointing to prevnode
			
			//update list
			prevnode=currnode;
			currnode=nextnode;
		}
		head.next=null;
		head=prevnode;
		
		
	}
	
	public Node reverse_recursive(Node head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		
		//using recursion for elements other than head
		Node newhead=reverse_recursive(head.next);
		head.next.next=head; //pointing to head
		head.next=null;
		
		return newhead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Linkedlist_implementation li=new Linkedlist_implementation();
//		li.addfirst("a");
//		li.addfirst("is");
//		li.printlist();
//		li.addlast("list");
//		li.printlist();
//		li.addfirst("this");
//		li.printlist();
//		
//		li.deletefirst();
//		li.printlist();
//		
//		li.deletelast();
//		li.printlist();
//		
//		System.out.println(li.getsize());
//		li.addfirst("this");
//		System.out.println(li.getsize());
		
		li.addfirst(1);
		li.addlast(2);
		li.addlast(3);
		li.addlast(4);
		li.addlast(5);
		//original list
		li.printlist();
		//reversed list- iterative
//		li.reverse_iterate();
		//reversed list- recursion
		li.head=li.reverse_recursive(li.head); //taking head as this
		li.printlist();
		
		

	}

}
