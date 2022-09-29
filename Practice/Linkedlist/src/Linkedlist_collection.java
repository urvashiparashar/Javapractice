import java.util.*;
public class Linkedlist_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>ll=new LinkedList<>();
		ll.addFirst("a");
		ll.addFirst("is");
		ll.addFirst("this");
		
		ll.addLast("list");
		System.out.println(ll);
		System.out.println(ll.size());
//		Scanner sc=new Scanner(System.in);
//		String value=sc.nextLine();
		//use in loops
		for(int i=0;i<ll.size();i++)
		{
			//get element at ith index
			System.out.print(ll.get(i)+"->");
			//searching element in list
//			if(ll.get(i)==value)
//			{
//				System.out.println("found");
//				break;
//			}
		}
		System.out.print("null");
		System.out.println();
		ll.removeFirst();
		
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		//removing at specific locn
		ll.remove(1);
		System.out.println(ll);
		

	}

}
