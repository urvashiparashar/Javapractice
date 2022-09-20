import java.util.ArrayList;
import java.util.Scanner;

public class Subset_of_n_numbers {
	
	public static void printsubset(ArrayList<Integer>subsets)
	{
		for(int i=0;i<subsets.size();i++)
		{
			System.out.print(subsets.get(i));
		}
		System.out.println();
	}
	
	//arraylist for storing subsets
	public static void find_subsets(int n,ArrayList<Integer>subsets)
	{
		if(n==0)
		{
			//empty no.of elements
			System.out.println(subsets);
			return;
			
		}
		//subset add
		subsets.add(n); //element choice
		//for n-1 elements
		find_subsets(n-1, subsets);
		
		//remove subset from arraylist
		//not added elements
		subsets.remove(subsets.size()-1); //delete subset from arraylist 
		//n stored at last index
		find_subsets(n-1, subsets);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> subset=new ArrayList<>();
		find_subsets(n, subset);
		

	}

}
