import java.util.Scanner;

public class Bitmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=5;
//		int pos=2;
//		int bitmask=1<<pos;
//		
//		//1.get bit
//		
//		//for that particular bit
//		if((bitmask&n)==0)
//		{
//			System.out.println("bit is zero");
//		}
//		else
//		{
//			System.out.println("bit is one");
//		}
		
		//set bit
		//if we find posn at 1 then 
//		int n=5;
//		int pos=1;
//		int bitmask=1<<pos; //left shift i.e multiplt by 2
//		int newnumber=bitmask | n;
//		System.out.println(newnumber);
		
		//clear bit i.e bit a that posn to make 0
		//bitmask= 1<<pos
		//opern= !(bitmask)&n
//		int n=5;
//		int pos=2;
//		int bitmask=1<<pos; //left shift i.e multiplt by 2
//		int notbitmask=~bitmask;
//		int newnumber=notbitmask&n;
//		System.out.println(newnumber);
		
		
		//update bit
		Scanner sc=new Scanner(System.in);
		int opr=sc.nextInt();
		int n=5;
		int pos=2;
		if(opr==0)
		{  //clear oprn
		int bitmask=1<<pos; //left shift i.e multiplt by 2
		int notbitmask=~bitmask;
		int newnumber=notbitmask&n;
		System.out.println(newnumber);
		}
		else
		{
			//set oprn
			int bitmask=1<<pos;
			int newnumber=bitmask|n;
			System.out.println(newnumber);
		}
		
		

	}

}
