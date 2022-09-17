
public class Check_if_array_sorted {

	public static boolean check_sorted(int[] arr,int index)
	{
		//base case
		if(index==arr.length-1)
		{
			return true;  //arr.length makes an exception
		}
//		if(arr[index]<arr[index+1])
//		{
//			return check_sorted(arr, index+1); //to check if further array is sorted or not
//			
//		}
//		else {
//			return false;
//		}
		if(arr[index]>=arr[index+1])
		{
			return false;
		}
		return check_sorted(arr, index+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,5};
		System.out.println(check_sorted(arr, 0));

	}

}
