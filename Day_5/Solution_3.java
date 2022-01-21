import java.util.*;
import java.io.*;

class Solution_3 {
    
    // search method with receiveing as array and target as an input.
    public static boolean search(int[][] array, int target){
        
        int left=0, right=array[0].length-1, top=0, down=array.length-1;
        
        // Logic for finding the target value in an array.
        while(top <= down) {
            if(array[top][left]<=target && target<=array[top][right]){
                for(int i=left; i<=right; i++){
                    if(array[top][i] == target) return true; // Return true if the target value found in an array.
                }
                return false; // Return false if the target value not found in the exisiting row.
            }
            top++;
        }
        return false; // Return false if the target value is not exist in an array.
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row size : "); // Display a message.
        int row = scan.nextInt(); // Take row size input from the user.
        System.out.print("Enter column size : "); // Display a message.
        int column = scan.nextInt(); // Take column size input form the user.
        int[][] array = new int[row][column]; // Declare 2D Array.
        System.out.print("Enter the values in an array : "); // Display a message.
        // Take array input from the user.
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j] = scan.nextInt();
            }
        }
        
        System.out.print("Enter a target value you want to be searching : "); // Display a message.
        int target = scan.nextInt(); // Take target value from the user.
        
        System.out.print(search(array,target)); // Call the search method with passing array and target as an argument.
        
    }
}