//hashset time complexity jas constant time for insert,search,delete operation
//import hashset to use hashset
import java.util.HashSet;
import java.util.Iterator;
public class Hashset_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>set=new HashSet<>(); //hashset has no gurantee of order as they are put
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); //but no two 1's get add only single 1 gets add
		
		//search-contains
//		if(set.contains(1))
//		{
//			System.out.println("set contains 1");
//		}
//		if(!set.contains(6))
//		{
//			System.out.println("doesnot contain 6");
//		}
//		
//		//remove
//		set.remove(1);
//		if(!set.contains(1))
//		{
//			System.out.println("doesnot contain 1");
//		}
		
		//size
		System.out.println(set.size()); //size is 3 as duplicates are ignored
		//print all elements
		System.out.println(set);
		//iterator: returns iterator for set for traversal
		Iterator it=set.iterator();
		//first iterator points to null
		//next : returns next elementn by poitning 
		//hasnext: returns true if iterator points to next value else if it doesnot point to next value then returns false
		while(it.hasNext())
		{
			//till when it points next value
			System.out.println(it.next());
		}
		
		

	}

}
