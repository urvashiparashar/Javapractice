
public class Movextoendofstring {
	
	public static void print_str(String str,int index,int count,String newstring)
	{
		//base case
		//time complexity=o(n)
		if(index==str.length())
		{
			for(int i=0;i<count;i++)
					{
				       newstring+='x';
					}
			System.out.println(newstring);
			return;
		}
		char currchar=str.charAt(index);
		if(currchar=='x')
		{
			count++;
			print_str(str, index+1, count, newstring);
			//count all char
		}
		else
		{
			newstring+=currchar;
			print_str(str, index+1, count, newstring);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="aaxxbcdd";
            print_str(str, 0, 0, "");
	}

}
