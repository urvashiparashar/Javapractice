
public class Selectionsort {
	
	public static void printarray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selection sort
		//find minimum element at index and swap with the first position
		int arr[]= {7,8,3,1,2};
		//outer loop runs for n-1 times
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i; //imdex posn where smallest is the element
			for(int j=i+1;j<arr.length;j++)
			{
				//arr.length as length decreases from front
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			//swap
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		printarray(arr);

	}

}
