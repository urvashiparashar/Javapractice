import java.util.Scanner;


public class Permutationsstring_backtracking {
	
	//time complecity=O(n*n!) where n!=total permutations and n is length of string

	//going back from final answer is called backtracking
	//string permutations
	public static void print_permutations(String str, String perm,int idx)
	{
		//base case
		if(str.length()==0)
		{
			System.out.println(perm);
			return;
		}
		
		//idx for every character
		for(int i=0;i<str.length();i++)
		{
			//char at current posn
			char curr_char=str.charAt(i);
			//remove other char than curr_char
			String newstring=str.substring(0, i)+str.substring(i+1);
			//ek position bhardi
//			perm=perm+curr_char;
			print_permutations(newstring, perm+curr_char, idx+1);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print_permutations(s, "", 0);
		
		

	}

}
