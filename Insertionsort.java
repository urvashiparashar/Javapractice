
public class Insertionsort {
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//insertion sort tc=O(n^2) as j will travel till 0
		//sorted and unsorted part of array
		//unsorted element placed in sorted array i.e unsorted size decreases
		int[] arr= {7,8,3,1,2};
		
		//outer loop
		for(int i=0;i<arr.length;i++)
		{
			int curr=arr[i];
			//taken sorted element as arr[i]
			int j=i-1; //j is taken as 1 less than i
			while(j>=0 && curr<arr[j])
			{
				arr[j+1]=arr[j]; //arr[j+1] replaced by arr[j]
				j--; //decrement j
			}
			//placement of elements
			arr[j+1]=curr;
		}
		printarray(arr);
		

	}

}
