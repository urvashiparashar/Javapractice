import java.util.Scanner;

public class Dectobinary {
	
//	public static void printbin(int n)
//	{
//		int[] binary=new int[1000];
//		int i=0;
//		while(n>0)
//		{
//			binary[i]=n%2; ///remiander stored at ith posn
//			n=n/2; //divide by 2
//			i++;  //increment for index
//		}
//		for(int k=i; k>=0;k--)
//		{
//			System.out.print(binary[k]);
//		}
//		
//	}
	
	public static void binarytodec(String n)
	{
		String s=n;
		int len=s.length();
		int base=1;
		int dec=0;
		for(int i=len-1;i>=0;i--)
		{
			//for string length we start from posn len-1
			if(s.charAt(i)=='1')
				dec+=base;
			base=base*2; //then else multiply by 2
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		printbin(n);
	    String str=sc.next();
	    binarytodec(str);

	}

}
