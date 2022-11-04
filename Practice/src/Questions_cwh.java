
public class Questions_cwh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question 1
//		float[] marks= {47.5f,31,0f,67.8f,96,0f};
//		float sum=0;
//		for(float i:marks)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
		
		//question 2
		float[] marks= {47.5f,31,0f,67.8f,96,0f};
		float num=47.5f;
		boolean found=false;
		for(float i:marks)
		{
			if(i==num)
			{
				found=true;
				break; //if found then out of loop
			}
		}
		if(found)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
