
public class Reverse_array {

	public static void reverse(int[] arr,int s,int e,int n)
	{
		if(s>=e)
			return; //return from here if above condition is true as s cannot be greater than e
	    int temp=arr[s];
	    arr[s]=arr[e];
	    arr[e]=temp;
	    
	    reverse(arr, s+1, e-1, n);
	
	}
	
	public static void print_array(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2000,455,123,45,3};
		int s=arr.length;
		System.out.println("before reversing");
		print_array(arr, s);
		reverse(arr, 0, 4, s);
		System.out.println("after reversing");
		print_array(arr, s);

	}

}
