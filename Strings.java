import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		//when taking only a word as input
//		String s=sc.next(); 
//		System.out.println("string is: "+s);
		//taking a sentence
//		String str=sc.nextLine();
//		System.out.println("sentence : "+str);
		
		//concating 2 strings
//		String a=sc.next();
//		String b=sc.next();
//		String fs=a+" "+b;
//		System.out.println(fs.length());
//		
//		//printing each character of string
//		for(int i=0;i<fs.length();i++)
//		{
//			System.out.println(fs.charAt(i));
//		}
		
		//compare 2 strings
		String str1="Tony";
		String str2="Tony";
		//hello and wello : wello is greater as w>h
		//hello and cello : hello is greater as h>c
		//aahello and aabello : aahello is greater 
//		if(str1.compareTo(str2)==0)
//		{
//			//checks 3 case:
//			//1. str1>str2 : +ve value
//			//2. str1==str2 : 0
//			//3. str1<str2 : -ve value
//			System.out.println("strings are equal");
//		}
//		else
//		{
//			System.out.println("strings are not equal");
//		}
		
//		if(str1==str2) //many cases fail here
//		{
//			System.out.println("equal");
//		}
//		else
//		{
//			System.out.println("not equal");
//		}
		
//		if(new String("Tony")==new String("Tony"))
//		{
//			System.out.println("equal"); //strings are object in java 
//			//and primitive data types have diff functioning
//		}
//		else
//		{
//			System.out.println("not equal");
//		}
		
		//substring
		String s="My name is Tony Stark";
		String str=s.substring(4, s.length()); //ek kam i.e length-1 char
		String sen=s.substring(5); //by default ending index is taken as length
		System.out.println(sen);
		
		//strings are immutable in java..not add nor remove ..we have to create a new string
		

	}

}
