
public class Quicksort {
	
	//time complexities of quick sort:
	//worst case: when pivot is smallest or largest element- O(n^2)
	//when array is ascending or descending
	//as there are n levels with loop at each level
	
	//as quick sort doesnot require any other array: less memory
	
	//average case: O(nlogn)
	
	public static int partition(int[] arr,int low,int high)
	{
		//taking high as pivot element
		int pivot=arr[high];
		int i=low-1; //no ele less than pivot
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				//ek or khali jagah mil gyi
				//increment i
				i++;
				//swapping elements less than pivot
				//swap elements at idx j and pivot ele
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//for pivot storing at correct position
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
		
	}
	
	public static void quicksort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			//only then quickosrt is implemented then
			int pidx=partition(arr,low,high);
			
			quicksort(arr, low, pidx-1); //ele less than pivot
			quicksort(arr, pidx+1, high); //ele more than pivot
		}
	}
	
	//involves making pivot element
	//1. start element
	//2. last element
	//3. median element
	//4. random element

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {6,3,9,5,2,8};
		int arr_size=arr.length;
		quicksort(arr, 0, arr_size-1);
		//printing array
				for(int i=0;i<arr_size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				System.out.println();

	}

}
