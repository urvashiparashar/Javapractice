
public class Maxandmininarray {
	
	static class Pair
	{
		int min,max; //we will get answer in Pair form
	}
	
	//function to calculate the min and max of element
	static Pair getminmax(int arr[],int n)
	{
		Pair minmax=new Pair();
		//making object of class Pair
		int i;
		
		//if only one element in array
		if(n==1)
		{
			minmax.max=arr[0];
			minmax.min=arr[0];
			return minmax; //return object of type Pair
		}
		if(arr[0]>arr[1])
		{
			//first element greater than second ele
			minmax.max=arr[0];
			minmax.min=arr[1];
		}
		else
		{
			minmax.max=arr[1];
			minmax.min=arr[0];
		}
		for(i=2;i<n;i++) //redefined value of i
		{
			if(arr[i]>minmax.max)
			{
				minmax.max=arr[i];
			}
			else if(arr[i]<minmax.min)
			{
				minmax.min=arr[i];
			}
		}
		return minmax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1000,11,44,1,330,3000};
		int n=6;
		Pair minmax=getminmax(arr, n);
		System.out.println(minmax.min);
		System.out.println(minmax.max);

	}

}
