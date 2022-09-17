
public class Towerofhanoi {
	
	public static void calctoh(int n, String src,String helper,String dest)
	{
		//base case: only 1 disc
		if(n==1)
		{
			System.out.println("transferring "+n+"th disc from "+src+" to "+dest);
		    return;
		}
		//transfer the n-1 discs from source->helper( dest=helper and helper=dest)
		calctoh(n-1, src, dest, helper);
		System.out.println("transferring "+n+"th disc from "+src+" to "+dest);
		//now transfer n-1 discs from helper->dest(src=helper and helper=src)
		calctoh(n-1, helper, src, dest);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
		calctoh(n, "S", "H", "D");

	}

}
