
public class Size_of_tile {
	
	public static int total_paths(int n,int m)
	{
		//base case
		if(n==m)
		{
			return 2;
		}
		if(n<m)
		{
			return 1;
		}
		int vertical_tiles=total_paths(n-m, m); //remaining tiles = n-m
		int horizontal_tiles=total_paths(n-1, m); //remaining tiles = n-1
		return vertical_tiles+horizontal_tiles;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4,m=3;
		System.out.println(total_paths(n, m));

	}

}
