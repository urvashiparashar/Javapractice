import java.util.Stack;

public class Reverse_stack {
	
	public static void pushatbottom(int data,Stack<Integer>s)
	{
		//base case
		if(s.isEmpty())
		{
			s.push(data);
			return;
		}
		//poping top
		int top=s.pop();
		pushatbottom(data, s);  //recursion
		s.push(top);
		
	}
	
	public static void reverse(Stack<Integer>s)
	{
		//base case
		if(s.isEmpty())
		{
			return;
		}
		int top=s.pop();
		reverse(s);
		pushatbottom(top, s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer>s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		reverse(s);
		
		while(!s.empty())
		{
			System.out.println(s.get(s.size()-1));
			s.pop();
		}

	}

}
