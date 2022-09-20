import java.util.Scanner;

public class Ways_to_call_guest {
	
	public static int call_guests(int n)
	{
		if(n<=1)
		{
			return 1; //also if n is less than 1
		}
		int ways1=call_guests(n-1); //single guest
		//pair
		int ways2=(n-1)*call_guests(n-2); 
		return ways1+ways2;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(call_guests(n));
	}

}
