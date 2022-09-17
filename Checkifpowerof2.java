import java.util.Scanner;

public class Checkifpowerof2 {
	
	public static boolean checkforpowerof2(int n)
	{   int cnt=0;
		while(n>0)
		{   
			//as n is greater than 0
			if((n &  1)==1)
			{
				cnt++; //increment count
			}
			n=n>>1; //make irght shift i.e divide by 2
				
		}
		if(cnt==1)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(checkforpowerof2(n));

	}

}
