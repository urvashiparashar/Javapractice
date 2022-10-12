
public class Queue_byarray {
	
	//fixed size
	static class Queue
	{
		static int arr[];
		static int size;
		static int rear=-1;
		
		
		Queue(int n)
		{
			arr=new int[n];
			this.size=n;
		}
		public static boolean isempty()
		{
			return rear==-1;
			//returns true if rear is equal to -1
		}
		//enqueue: add element to queue from rear
		public static void add(int data)
		{
			if(rear==size-1)
			{
				System.out.println("queue is full");
				return ;
			}
			rear++;
			arr[rear]=data;
		}
		//add operation: O(1)
		
		//dequeue: remove element from front
		public static int remove()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			int front=arr[0];
			//pusb last ele forward
			for(int i=0;i<rear;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
			
		}
		//remove operation : O(n)
		
		//peek opeartion
		public static int peek()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			
			return arr[0];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		while(!q.isempty())
		{
			System.out.println(q.peek());
			q.remove();
		}

	}

}
