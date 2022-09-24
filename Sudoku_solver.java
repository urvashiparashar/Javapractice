class Solution {
    
    public boolean issafe(char[][] board,int row,int col,int number)
    {
        //row and col
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==(char)(number+'0'))
            {
                return false; //number found
            }
            if(board[row][i]==(char)(number+'0'))
            {
                return false; //number found
            }
        }
        //grid
        int s_r=(row/3)*3;
        int s_c=(col/3)*3;
        //incrementing s_r and s_c
        for(int i=s_r;i<s_r+3;i++)
        {
            for(int j=s_c;j<s_c+3;j++)
            {
                if(board[i][j]==(char)(number+'0'))
                {
                    //number found
                    return false;
                }
            }
        }
        return true;
    }
    //valid soduku soln returns true
//     public boolean helper(char[][] board,int row,int col)
//     {
//         //base case
//         if(row==board.length)
//         {
//             return true;
//         }
//         int nrow=0,ncol=0;
//         if(col!=board.length-1)
//         {
//             nrow=row; //row is same 
//             ncol=col+1; //col increases by 1
//         }
//         else
//         {
//             nrow=row+1;
//             ncol=0; 
//         }
//         if(board[row][col]!='.') //number is there in cell
//         {
//             if(helper(board,nrow,ncol))
//             {
//                 return true; //if valid soduku
//             }
//             else
//             {
//                 for(int i=1;i<=9;i++)
//                 {
//                     if(issafe(board,row,col,i)) //if safe to make i sit at row and col
//                     {
//                         board[row][col]=(char)(i+'0'); // typecast to char as board
//                         if(helper(board,nrow,ncol))
                           
//                                return true;
                           
//                            else
                           
//                                board[row][col]='.';
                           
//                     }
//                 }
//             //not satisfied any conditions
//             }
//         }
//         return false;
        
//     }
               
    public boolean helper(char[][] board, int row, int col) {
       if(row == board.length) {
           return true;
       }
      
       int nrow = 0;
       int ncol = 0;
      
       if(col == board.length-1) {
           nrow = row + 1;
           ncol = 0;
       } else {
           nrow = row;
           ncol = col + 1;
       }
      
       if(board[row][col] != '.') {
           if(helper(board, nrow, ncol)) {
               return true;
           }
       } else {
          
           //fill the place
           for(int i=1; i<=9; i++) {
               if(issafe(board, row, col, i)) {
                   board[row][col] = (char)(i+'0');
                   if(helper(board, nrow, ncol))
                       return true;
                   else
                        board[row][col] = '.';
               }
           }
       }
                     
       return false;
   }
  

    

    public void solveSudoku(char[][] board) {
        helper(board,0,0); //starts from 0,0
    }
}
public class Sudoku_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
