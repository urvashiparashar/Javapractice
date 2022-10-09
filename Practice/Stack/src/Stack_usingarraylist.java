import java.util.ArrayList;

public class Stack_usingarraylist {
	
	static class Stack
	{
		static ArrayList<Integer>list=new ArrayList<>();
		public static boolean isempty()
		{
			return list.size()==0;
		}
		//push
		public static void push(int data)
		{
		   list.add(data);
		}
		//pop
		public static int pop()
		{
		  if(isempty())
		  {
			  return -1;
		  }
		  int top=list.get(list.size()-1); //ele stored at top
		  list.remove(list.size()-1); //deleting top ele
		  return top; //return top ele
		} 
		//peek
		public static int peek()
		{
			if(isempty())
			{
				return -1;
			}
			return list.get(list.size()-1); //top ele everytime
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
			System.out.println(s.peek());
			s.pop();
		}

	}

}
