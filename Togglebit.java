import java.util.Scanner;

public class Togglebit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int bitmask=1<<(k-1);
		int togglebit=n^(bitmask);
		System.out.println(togglebit);

	}

}
