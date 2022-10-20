//hashmap stores a pair of key and value
//value need not to be unique but key us always unique
//import hashmap class from util package

import java.util.*;
public class Hashmap_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       HashMap<String, Integer>map=new HashMap<>();
       map.put("india", 120);
       map.put("China", 30);
       map.put("US", 70);
       //unordered map prints
       System.out.println(map);
       map.put("China", 180); //value update for china
       System.out.println(map);
       
       //search
//       if(map.containsKey("Indonesia"))
//       {
//    	   System.out.println("key is present");
//       }
//       else
//       {
//    	   System.out.println("key is not present");
//       }
//       //get the value using key
//       System.out.println(map.get("China"));
//       System.out.println(map.get("Indonesia")); //prints null

//         int arr[]= {1,2,3};
//         for(int i=0;i<arr.length;i++)
//         {
//        	 System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         for(int val:arr)
//         {
//        	 System.out.println(val);
//         }
       
       //for iterations in map
       //1. using mapentry set
//       for(Map.Entry<String, Integer> e : map.entrySet())
//       {
//    	   //printing key value pair
//    	   System.out.print(e.getKey()+" ");
//    	   System.out.print(e.getValue()+" ");
//       }
//       System.out.println();
       
       //2. using set of keys
       Set<String>s=map.keySet(); //creating set of keys
       
       for(String str:s)
       {
    	   System.out.println(str+" "+map.get(str));
       }
       
       //deleting pair using key : deletes whole map
       map.remove("China");
       System.out.println(map);
	}

}
