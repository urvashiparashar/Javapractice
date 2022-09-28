
public class Reversearray {
	
	static void reverse_array(int[] arr,int s,int e,int n)
	{
		int temp;
		if(s>=e)
			return; 
		temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		//recursion
		reverse_array(arr, s+1, e-1, n);
		
	}
	
	static void printarray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 4, 5, 6};
        printarray(arr, 6);
        reverse_array(arr, 0, 5,6);
        System.out.println("Reversed array is ");
        printarray(arr, 6);

	}

}
