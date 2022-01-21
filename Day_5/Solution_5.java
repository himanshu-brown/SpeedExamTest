import java.util.*;
import java.io.*;

class Solution_5 {
    
    public static void rotateClockWise(int[][] array) {
        
        int N=array.length; 
        
        // Logic for rotate the image by 90 degrees.
        for(int i=0; i<N/2; i++){
            for(int j=i; j<N-1-i; j++){
                int temp = array[i][j];
                array[i][j] = array[N-j-1][i];
                array[N-j-1][i] = array[N-i-1][N-j-1];
                array[N-i-1][N-j-1] = array[j][N-i-1];
                array[j][N-i-1] = temp;
            }
        }
        
        // Display the 2D Array after rotation.
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row size : "); // Display a message.
        int row = scan.nextInt(); // Take row size input from user.
        System.out.print("Enter column size : "); // Display a message.
        int column = scan.nextInt(); // Take column size input from user.
        int[][] array = new int[row][column]; // Declare 2D Array.
        System.out.print("Enter the values in an array : "); // Display a message.
        // Take input in 2D Array from user.
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = scan.nextInt();
            }
        }
        
        rotateClockWise(array); // Call rotateClockWise method  with passing array as an argument.
    }
}