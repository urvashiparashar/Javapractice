import java.util.*;
public class Checkprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           boolean prime=true;
           //checking for prime
           for(int i=2;i<=n/2;i++)
           {
        	   //eg n==10 till 5
        	   if(n%i==0)
        	   {
        		   prime=false; //not prime
        		   break; //comes out of loop
        	   }
        		   
           }
           if(prime)
           {
        	   //if prime is 1
        	   if(n==1)
        	   {
        		   System.out.println("neither prime nor composite");
        	   }
        	   else
        	   {
        		   System.out.println("prime");
        	   }
           }
           else
           {
        	   System.out.println("not prime");
           }
	}

}
