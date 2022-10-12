
public class Queue_usinglist {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	static class QueueY
	{
		static Node head=null;
		static Node tail=null;
		
		//no need of constructor
		
		//empty queue
		public static boolean isempty()
		{
			return head==null && tail==null;
		}
		
		//enqueue
		public static void add(int data)
		{
			Node newnode=new Node(data);
			//new node adds from tail of list so i.e newnode is the first node
			if(tail==null)
			{
				tail=head=newnode;
				return;
			}
			tail.next=newnode;
			tail=newnode;
					
		}
		
		//dequeue
		public static int remove()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			//removes from front of list
			int front=head.data;
			if(head==tail)
			{
				tail=null ; //as from head element would be removed
			}
			head=head.next;
			return front;
		}
		//peek
		public static int peek()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueY q=new QueueY();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		while(!q.isempty())
		{
			System.out.println(q.peek());
			q.remove();
		}

	}

}
