import java.util.Scanner;

public class Countnoof1inbr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cnt=0;
		while(n>0)
		{
			if((n&1)==1)
				cnt++;
			n=n>>1;
			
		}
		System.out.println(cnt);

	}

}
