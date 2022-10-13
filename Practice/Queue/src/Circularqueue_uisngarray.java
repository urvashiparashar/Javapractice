//import Queue_byarray.Queue;

public class Circularqueue_uisngarray {

	//fixed size
		static class Queue
		{
			static int arr[];
			static int size;
			static int rear=-1;
			static int front=-1;
			
			
			Queue(int n)
			{
				arr=new int[n];
				this.size=n;
			}
			public static boolean isempty()
			{
				return rear==-1 && front==-1;
				//returns true if rear is equal to -1
			}
			public static boolean isfull()
			{
				return (rear+1)%size==front;
			}
			
			//enqueue: add element to queue from rear
			public static void add(int data)
			{
				if(isfull())
				{
					System.out.println("queue is full");
					return ;
				}
				//first element add
				if(front==-1)
				{
					front=0;
				}
				rear=(rear+1)%size;
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
				int res=arr[front];
				
				if(front==rear)
				{
					front=rear=-1; //single element remove
				}
				else
				{
					front=(front+1)%size; //frontis at last index then increase by 1 and make it to 0
				}
				
				return res;
				
			}
			//remove operation : O(1)
			
			//peek opeartion
			public static int peek()
			{
				if(isempty())
				{
					System.out.println("queue is empty");
					return -1;
				}
				
				return arr[front];
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Queue q=new Queue(5);
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);
			q.add(5);
			System.out.println(q.remove());
		       q.add(6);
		       System.out.println(q.remove());
		       q.add(7);

			
			while(!q.isempty())
			{
				System.out.println(q.peek());
				q.remove();
			}

		}

}
