
public class Reverse_string_recursion {
	
	public static void reverse_string(String str,int index)
	{
		if(index==0)
		{
			System.out.print(str.charAt(index));
			return;
		}
		System.out.print(str.charAt(index));
		reverse_string(str, index-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcd";
		reverse_string(str, str.length()-1);
		//tc=o(n) equal to string length

	}

}
