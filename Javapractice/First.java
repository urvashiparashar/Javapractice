public class First {
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bubble sort:ascending
		//n-1 comparisions. tc=o(n^2)  so not good tc
		//with iteration the last element gets sorted , then 2nd last and so on
		//for descending we take smallest element to last
		
		int[] arr= {7,8,3,1,2};
		//outer loop
		for(int i=0;i<arr.length-1;i++)
		{
			//n-1 ,n-2,n-3  etc. times
			//every iteration removes one last element
			for(int j=0;j<arr.length-1-i;j++)
			{   //swap: ascending
//				if(arr[j]>arr[j+1])
//				{    //i is just a counter and index is defined by j
//					
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
				//swap: descending
				if(arr[j]<arr[j+1])
				{    //i is just a counter and index is defined by j
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		printarray(arr);

	}

}
