import java.util.Scanner;

public class Print_subsequence_of_string {
	
	public static void print_subsequence(String str,int idx,String newstring)
	{
		//empty string is also a subsequence of string
		
		if(idx==str.length())
		{
			System.out.println(newstring);
			return;
		}
		char curr_char=str.charAt(idx);
		//chooses to be
		print_subsequence(str, idx+1, newstring+curr_char); 
		//curr_char added to newstring
		//chooses not to be
		print_subsequence(str, idx+1, newstring);
		//curr_char not added
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print_subsequence(s, 0, "");

	}

}
