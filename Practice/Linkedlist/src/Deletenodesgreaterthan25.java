import java.util.LinkedList;

public class Deletenodesgreaterthan25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>li=new LinkedList<>();
		li.addFirst(1);
		li.addFirst(2);
		li.addFirst(3);
		li.addFirst(26);
		li.addFirst(27);
		for(int i=0;i<li.size();i++)
		{
			if(li.get(i)>25)
			{
				li.remove(i);
			}
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}

	}

}
