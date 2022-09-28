//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//A subarray is a contiguous part of an array.
//
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//
//Example 2:
//Input: nums = [1]
//Output: 1
//
//Example 3:
//Input: nums = [5,4,-1,7,8]
//Output: 23

public class Maximum_subarray {

	public static int max_subarray(int[] arr,int n)
	{
		int temp=arr[0];
		int ans=temp;
		//as we took temp as 0th ele so we will run loop from 1st ele
		for(int i=1;i<n;i++)
		{
			temp=Math.max(temp+arr[i], arr[i]);
			//updating ans
			ans=Math.max(ans, temp);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int s=arr.length;
		System.out.println(max_subarray(arr, s));

	}

}


