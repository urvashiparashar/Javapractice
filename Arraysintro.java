import java.util.*;
public class Arraysintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] marks=new int[3];
		Scanner sc=new Scanner(System.in);
//		marks[0]=91;
//		marks[1]=92;
//		marks[2]=93;
//		for(int i=0;i<3;i++)
//		{
//			marks[i]=sc.nextInt();
//		}
//		int x=sc.nextInt();
//		for(int i=0;i<3;i++)
//		{
//		  if(marks[i]==x)
//			  System.out.println("element found at: "+i);
//		}
		
		//search in 2d array
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] mat=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		int x=sc.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j]==x)
				{
					System.out.println("found at: "+i+" "+j);
				}
			}
		}

	}

}
