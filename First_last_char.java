import java.util.Scanner;

public class First_last_char {
	
	public static int first=-1;
	public static int last=-1;
	
	//tc=o(n)
	
	public static void first_last(String str,int index,char ele)
	{
		//base case
		if(str.length()==index)
		{
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char curr_char=str.charAt(index);
		if(curr_char==ele)
		{
			//for fist occurence
			if(first==-1)
				first=index;
			else
				last=index; //not sure if last or first
		}
		first_last(str, index+1, ele);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		first_last(s,0, 'a');

	}

}
