import java.util.Scanner;

public class Keypad_combination {
	
	//keypad combinations mapping in phone
//	0->.
//	1->abc
//	2->def
//	3->ghi
//	4->jkl
//	5->mno
//	6->pqrs
//	7->tu
//	8->vwx
//	9->yz
	
	//multiple level choices for each number
	
	//map creation
	
	//tc=O(4^n) //max choice at number=4 and n is the string length
	
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu"
			,"vwx","yz"
	};
	public static void print_combinations(String str,int idx,String combination)
	{
		//base case
		if(idx==str.length())
		{
			System.out.println(combination);
			return;
		}
		
		char curr_char=str.charAt(idx); //current character
		String mapping=keypad[curr_char-'0']; //for representing mapping
		
		for(int i=0;i<mapping.length();i++)
		{
			print_combinations(str, idx+1, combination+mapping.charAt(i));
			//taking each char of mapping --> d,e,f
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print_combinations(s, 0, "");
	}

}
