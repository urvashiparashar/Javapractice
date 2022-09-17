
public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringBuilder sb=new StringBuilder("Tony");
		//sb naam ka string of type stringbuilder
//		System.out.println(sb);
//		System.out.println(sb.charAt(0));
		
		//set char at index
//		sb.setCharAt(0, 'P'); //only make changes not println
//		System.out.println(sb);
		
		//insert string
//		sb.insert(2, 'n');
////		System.out.println(sb);
////		
////		//delete the extra n
////		sb.delete(2, 3); //bas 2 tk jayega
////		System.out.println(sb);
//		
//		sb.delete(2, 4);
//		System.out.println(sb);
		
		//performing operations with hello
		
		StringBuilder sb=new StringBuilder("h");
		sb.append("e");
		sb.append("l");
		sb.append("l");
		sb.append("o"); //using append we reduce tc and also changes occur at the string
		
		System.out.println(sb);
		
		//reversing a string
		for(int i=0;i<sb.length()/2;i++)
		{
			int front=i;
			int back=sb.length()-i-1; //piche se
			char frontchar=sb.charAt(front) ; //front char
			char backchar=sb.charAt(back);
			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);
			
		}
		System.out.println(sb);
		
		
		

	}

}
