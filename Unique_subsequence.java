import java.util.HashSet;
import java.util.Scanner;

public class Unique_subsequence {
	
	public static void print_subsequence(String str,int idx,String newstring, HashSet<String>set)
	{
		//hashset for storing unique strings
		//empty string is also a subsequence of string
		//tree formed by choosing to be in or to be not in
		//no.of subsequence=2^n where n is the length os string
		//time complexity=o(2^n)
		//2^n=(2^n-1)*2
		//2^n-1=(2^n-2)*2
		//every nodes in tree represent the function call
		
		if(idx==str.length())
		{
			if(set.contains(newstring)) //string already in set
			{
				return;
			}
			else
			{
				System.out.println(newstring);
				set.add(newstring); //add new string i.e not existing(unique)
				return;
			}
		}
		char curr_char=str.charAt(idx);
		//chooses to be
		print_subsequence(str, idx+1, newstring+curr_char,set); 
		//curr_char added to newstring
		//chooses not to be
		print_subsequence(str, idx+1, newstring,set);
		//curr_char not added
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		HashSet<String>set=new HashSet<>();
		print_subsequence(s, 0, "",set);

	}

}
