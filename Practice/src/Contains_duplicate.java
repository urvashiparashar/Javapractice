import java.util.HashSet;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true


public class Contains_duplicate {
	
	public static boolean duplicate(int[] arr,int n)
	{
	  //using hashset as it only contains unique elements
		HashSet<Integer>h=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(h.contains(arr[i]))
				return true;
			else
				h.add(arr[i]);
		}
		//else array doesnot contain duplicate elements
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,1,1,3,3,4,3,2,4,2};
		int s=arr.length;
		System.out.println(duplicate(arr, s));

	}

}
