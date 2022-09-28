import java.util.Arrays;
import java.util.Scanner;

//Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
//Output: Minimum Difference is 2 
//Explanation:
//We have seven packets of chocolates and we need to pick three packets for 3 students 
//If we pick 2, 3 and 4, we get the minimum difference between maximum and minimum packet sizes.
//
//Input : arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 
//Output: Minimum Difference is 6 


public class Chocolate_distribution {
	
	public static int min_diff(int[] arr,int n,int m)
	{
		if(n==0 || m==0)
			return 0;
		//sort array
		Arrays.sort(arr);
		if(n<m)
			//as number of people cannot be greater than n so return -1
			return -1;
		int min_diff=Integer.MAX_VALUE; //taking diff as max value
		for(int i=0;i+m-1<n;i++)
		{
			int diff=arr[i+m-1]-arr[i]; //taking m values in a row and traversing through array
			if(min_diff>diff)
			    min_diff= diff;
				
		}
		return min_diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7, 3, 2, 4, 9, 12, 56};
		int s=arr.length;
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
		System.out.println(min_diff(arr, s, m));

	}

}
