import java.util.Scanner;

public class Permutations_of_string {

	//permutations are all possible combinations
	//total no.of permutations is length of string!=3!
	public static void print_permu(String str,String permutation)
	{
		//base case
		if(str.length()==0)
		{
			//for empty string
			System.out.println(permutation);
			return;
		}
		//for each character in string
		for(int i=0;i<str.length();i++)
		{
			char curr_char=str.charAt(i);
			String newstr=str.substring(0, i)+str.substring(i+1);
			//rest string store in str
			print_permu(newstr, permutation+curr_char);
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print_permu(s, "");

	}

}
