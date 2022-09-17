import java.util.Scanner;

public class Combinedlengthofstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		int size=sc.nextInt();
//		String[] arr=new String[size]; //array of strings
//		int len=0;
//		for(int i=0;i<size;i++)
//		{
//			arr[i]=sc.next();
//			len+=arr[i].length();
//		}
//		System.out.println(len);
		
		//replace char e of string
//		String inputstr=sc.next();
//		String res=""; //empty string as result
//		for(int i=0;i<inputstr.length();i++)
//		{
//			if(inputstr.charAt(i)=='e')
//			{
//				res+='i'; //add i in place of e when encountered
//			}
//			else
//			{
//				res+=inputstr.charAt(i);
//			}
//		}
//		System.out.println(res);
		
		//print email only before @
		String email=sc.next();
		String username="";
		for(int i=0;i<email.length();i++)
		{
			if(email.charAt(i)=='@')
				break ; //comes out of loop
			else
				username+=email.charAt(i);
		}
		System.out.println(username);

	}

}
