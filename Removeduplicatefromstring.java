import java.util.Scanner;

public class Removeduplicatefromstring {
	
	public static boolean map[]=new boolean[26];
	public static void remove_duplicate(String str,int idx, String newstring)
	{
		//base case
		if(idx==str.length())
		{
			System.out.println(newstring);
			return;
		}
		//map can by directly access by name as it is static
		char curr_char=str.charAt(idx);
		if(map[curr_char-'a']) //or ==true is same
		{
			//already visited
			//recursion
			remove_duplicate(str, idx+1, newstring);
		}
		else
		{
			//not visited so add to new string
			newstring+=curr_char;
			//make that index as true
			map[curr_char-'a']=true;
			remove_duplicate(str, idx+1, newstring);
					
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of 26 characters of boolean type initialised as false that maps at an index as : a->0,b->1,c->2...z->25
		//a-a=0, b-a=1 ....
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		remove_duplicate(s, 0, "");
		

	}

}
