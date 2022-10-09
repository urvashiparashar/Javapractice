
public class Stack_usinglist {
	
	//stack implemented using 3 ways:
	//1. array : stack is of fixed size
	//2. arraylist : variable size
	//3. linkedlist : variable size
	
	//1. using arrays: if(size of stack==n) : stack is full
	//and here the topest element is the last element of array  and first element as lowest element of stack

	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static class Stack
	{
		public static Node head;
		public static boolean isempty()
		{
			return head==null; //returns true if head is null: empty
		}
		public static void push(int data)
		{
			//first operation
			Node newnode=new Node(data);
			if(isempty())
			{
				head=newnode;
				return;
			}
			newnode.next=head;
			head=newnode;
		}
		public static int pop()
		{
			//if stack is empty
			if(isempty())
			{
				return -1;
			}
			//top element
			int top=head.data;
			//deleting element
			head=head.next;
			return top;
		}
		public static int peek()
		{
			if(isempty())
			{
				return -1;
			}
			return head.data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		while(!s.isempty())
		{
			//while stack is not empty
			System.out.println(s.peek());
			s.pop();
		}
	}

}
