import java.util.LinkedList;

public class Search_list {
	
	public static void findele(int val,LinkedList<Integer>li)
	{
		int k=-1;
		boolean found=false;
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)==val)
			{
				found=true;
				k=i;
			}
			
		}
		if(found==true)
		{
			System.out.println("found at index "+k);
		}
		else
		{
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>li=new LinkedList<>();
		li.addFirst(1);
		li.addLast(5);
		li.addLast(7);
		li.addLast(3);
		li.addLast(8);
		li.addLast(2);
		li.addLast(3);
		findele(7, li);

	}

}
