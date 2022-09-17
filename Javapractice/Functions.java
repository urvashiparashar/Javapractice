import java.util.Scanner;

public class Functions {
	
	//circumference
//	public static Double calculate_circum(Double rad)
//	{
//		return 2*3.14*rad;
//	}
	
	//count positive,negative,zeroes
//	public static void countnos(int input)
//	{   
//		int pos=0,neg=0,zer=0;
//		while(input==1)
//		{
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter the number");
//			int n=sc.nextInt();
//			if(n>0)
//				pos++;
//			else if(n<0)
//				neg++;
//			else 
//				zer++;
//			System.out.println("want to continue yes(1) or no(0)");
//			input=sc.nextInt();
//		}
//		System.out.println("positive are: "+pos+" negative are: "+neg+" zeroes are: "+zer);
//	}
//	public static void powerofx(int x,int n)
//	{
//		int res=1;
//		for(int i=1;i<=n;i++)
//		{
//			res=res*x;
//		}
//		System.out.println("result: "+res);
//	}
	
//	public static void printfibo(int n)
//	{
//		int a=0,b=1;
//		System.out.print(a+" ");
//		if(n>1)
//		{
//			for(int i=2;i<=n;i++)
//			{
//				System.out.print(b+ " ");
//				int next=a+b;
//				a=b;
//				b=next;
//				
//			}
//			System.out.println();
//		}
//			
//	}
	public static void gcd(int a,int b) {
		while(a!=b)
		{
			if(a>b)
				//a is greater than b
				a=a-b;
			else
				b=b-a;
		}
		System.out.println("gcd is: "+b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		
		Scanner sc=new Scanner(System.in);
//		Double r=sc.nextDouble();
//		System.out.println(calculate_circum(r));
		
		//infinite loop using do while
//		do
//		{
//			
//		}while(true);
//		int i=sc.nextInt();
//		countnos(i);
		int a=sc.nextInt();
		int b=sc.nextInt();
		gcd(a, b);
		
//		
//		powerofx(a, b);
		
//		int n=sc.nextInt();
//		printfibo(n);
		
		

	}

}
