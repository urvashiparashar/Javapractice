import java.util.*;
public class Nqueensinchess {
	
//time complexity = O(n^n)
    
    public static boolean issafe(int row,int col,char[][] board)
    {
        //checking for 8 directions to place next queen
        //checking horizontal line
        for(int j=0;j<board.length;j++)
        {
            if(board[row][j]=='Q')
            {
                //already queen is there in the row-horizontal
                return false;
            }
        }
        for(int i=0;i<board[0].length;i++)
        {
            if(board[i][col]=='Q')
            {
                //already queen is there in the col-vertical
                return false;
            }
        }
        //upper left: diagonally
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        //upper right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        //lower right
        for(int c=col;c<board.length && r<board.length ; c++,r++)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
        }
        return true;
            
    }
    
    public static void saveboard(char[][] board, List<List<String>>Allboards)
    {
        String row="";
        List<String>newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            //row string will be updated
            row="";
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='Q')
                {
                    row+='Q';
                }
                else
                {
                    row+='.';
                }
            }
            newboard.add(row);
        }
        Allboards.add(newboard);
    }
    
    public static void helper(char[][] board,List<List<String>>Allboards,int col)
    {
        //base case: col reaches n
        if(col==board.length)
        {
            saveboard(board,Allboards);
            return;
        }
        //first col: first queen
        for(int row=0;row<board.length;row++)
        {
            if(issafe(row,col,board))
            {
                //if queen is safe in row and col
                //place queen there
                board[row][col]='Q';
                helper(board,Allboards,col+1); //recursion
                
                //but if we backtrack and come back then this queen has to be removed
                board[row][col]='.';
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        //List1 : stores all boards
        //List2 : stores a particular board
        List<List<String>>Allboards=new ArrayList<>(); //arraylist of all boards
        //2d array for chessboard
        char[][] board=new char[n][n];
        helper(board,Allboards,0);
        return Allboards;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(solveNQueens(n));
	}

}
