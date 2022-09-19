
public class Maze_total_paths {
	
	public static int count_paths(int i,int j,int n,int m)
	{
		//base case
		if(i==n || j==m )
		{
			return 0;
		}
		if(i==n-1 || j==m-1)
		{
			return 1; //only one path to reach destination
		}
		//move downwards
		int down_paths=count_paths(i+1, j, n, m); //for down row incremented
		//move right
		int right_paths=count_paths(i, j+1, n, m); //for right col incremented
		return down_paths+right_paths;
	}
	
	
	//a maze of size (0,0) to (n,m)
	//2 conditions: can travel in right and downwards
	//corner cells having only one choice and other celss with 2 choices
	//(i,j)->(i+1,j)/(i,j+1) til i!=n-1 and j!=m-1

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3,m=3;
		int total_paths=count_paths(0, 0, n, m);
		System.out.println(total_paths);
		

	}

}
