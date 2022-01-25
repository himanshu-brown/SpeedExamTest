import java.util.*;
import java.io.*;

public class Solution_1
{
    // isValidSudoku method with two dimensional character array as parameter and return boolean value.
    public static boolean isValidSudoku(char[][] board){
        for(int i=0; i<9; i++){
            HashSet row = new HashSet<>();
            HashSet column = new HashSet<>();
            HashSet cube = new HashSet<>();
             int rowIndex= (i/3 >= 2)? 6 :(i/3 >= 1)?3 : 0;
            int colIndex=3* (i%3);
            for(int j=0;j<9;j++)
            {   
                if(board[i][j]!='.' && !(row.add(board[i][j])) )
                   return false;
                if(board[j][i]!='.' && !(column.add(board[j][i])))
                   return false;  
                if(board[rowIndex + j/3][colIndex + j%3]!='.' && !cube.add(board[rowIndex + j/3][colIndex + j%3]))
                   return false;
            }
        }
        return true;
        
    }
    
	public static void main(String[] args) {
	    char[][] board = new char[][] {
        { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };
		System.out.println(isValidSudoku(board)); // Call the isValidSudoku method.
	}
}
