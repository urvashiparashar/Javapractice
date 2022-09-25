
public class Mergesort {
	
	//time complexity=O(nlogn)
	
	public static void conquer(int arr[],int si,int mid,int ei)
	{
		//conquer techinque
		//creating new array
		int[] merged=new int[ei-si+1]; //as si and ei refers to index so +1
		int idx1=si; //trackes first array
		int idx2=mid+1; //trackes second array
		int x=0; //trackes merged index
		//all while loop represents O(n) 
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<=arr[idx2])
			{
				//put in merged array
				merged[x++]=arr[idx1++];
			}
			else {
				//put in merged array
				merged[x++]=arr[idx2++];
			}
		} //comparing both sorted arrays
		//if one of the array gets completed
		while(idx1<=mid)
		{
			//put in merged array
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei)
		{
			//put in merged array
			merged[x++]=arr[idx2++];
		}
		
		//copying the merged array to original array
		for(int i=0,j=si;i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
	}
	
	public static void divide(int[] arr,int si,int ei)
	{
		//divide technique
		//base case
		if(si>=ei)
		{
			return;
		}
		//calculating mid pt.
		//for time complexity issues we donot write as mi=(si+ei)/2;
		//represents O(Logn) 
		int mid=si+(ei-si)/2;
		//calling fucntions
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr,si,mid,ei);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {6,3,9,5,2,8};
		int arr_size=arr.length;
		divide(arr, 0, arr_size-1);
		//printing array
		for(int i=0;i<arr_size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}
