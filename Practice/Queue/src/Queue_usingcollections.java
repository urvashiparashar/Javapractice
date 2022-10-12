import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_usingcollections {
	
	static class Queue
	{
		static Stack<Integer>s1=new Stack<>();
		static Stack<Integer>s2=new Stack<>();
		
		public static boolean isempty()
		{
			return s1.isEmpty();
		}
		public static void add(int data)
		{
			while(!s1.isEmpty())
			{
				//push data from s1 to s2
				s2.push(s1.pop()); //pop from s1 and push to s2
			}
			s1.push(data);
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		public static int remove()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			return s1.pop();
			
		}
		public static int peek()
		{
			if(isempty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			return s1.peek();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Queue<Integer>q=new LinkedList<>();
//		Queue<Integer>q=new ArrayDeque<>(); //deque is double ended queue
//		//queue is interface in java: arraydeque and linkedlist
		Queue q=new Queue();
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
