import java.util.*;
import java.io.*;

class Solution_1 {
    
    // printArrayAntiClockWise method which receive array as parameter.
    public static void printArrayAntiClockWise(int[][] array){
        
        int maxRow=array.length, maxColumn=array[0].length;
        int left=0, right=maxColumn-1, top=0, down=maxRow-1;
        int direction=0,i=0;
        // Logic for printing the array in anti-clockwise direction.
        while(left<=right && top<=down) {
            // Print array from right to left.
            if(direction==0){
                for(i=right; i>=left; i--){
                    System.out.print(array[top][i]+" ");
                }
                direction=1;
                top++;
            }
            // Print array from top to down.
            if(direction==1){
                for(i=top; i<=down; i++){
                    System.out.print(array[i][left]+" ");
                }
                left++;
                direction=2;
            }
            // Print array form left to right.
            if(direction==2){
                for(i=left; i<=right; i++){
                    System.out.print(array[down][i]+" ");
                }
                down--;
                direction=3;
            }
            // Print array from down to top.
            if(direction==3){
                for(i=down; i>=top; i--){
                    System.out.print(array[i][right]+" ");
                }
                right--;
                direction=0;
            }
        }
        
    }
    
    // printArrayClockWise method which receive array as parameter.
    public static void printArrayClockWise(int[][] array){
        
        int maxRow=array.length, maxColumn=array[0].length;
        int left=0, right=maxColumn-1, top=0, down=maxRow-1;
        int direction=0,i=0;
        // Logic for print the array in clockwise direction.
        while(left<=right && top<=down) {
            // Print array from left to right.
            if(direction==0){
                for(i=left; i<=right; i++){
                    System.out.print(array[top][i]+" ");
                }
                direction=1;
                top++;
            }
            // Print array from top to down.
            if(direction==1){
                for(i=top; i<=down; i++){
                    System.out.print(array[i][right]+" ");
                }
                right--;
                direction=2;
            }
            // Print array from right to left.
            if(direction==2){
                for(i=right; i>=left; i--){
                    System.out.print(array[down][i]+" ");
                }
                down--;
                direction=3;
            }
            // Print array from down to top.
            if(direction==3){
                for(i=down; i>=top; i--){
                    System.out.print(array[i][left]+" ");
                }
                left++;
                direction=0;
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int row=0, col=0; // Declare variables.
        System.out.print("Enter size of row: "); // Display a message.
        row = scan.nextInt();// Take row size input from the user.
        System.out.print("Enter size of column: ");// Display a message.
        col = scan.nextInt(); // Take column size input from the user.
        int[][] array = new int[row][col]; // Declare 2D array.
        System.out.print("Enter the values in an array: "); // Display a message.
        // Take array input from the user.
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j] = scan.nextInt();
            }
        }
        
        System.out.print("Clock wise : "); // Display a message.
        printArrayClockWise(array); // Call printArrayClockWise method with passing array as an argument.
        System.out.println(); // For next line.
        System.out.print("Anti-clockwise : "); // Display a message.
        printArrayAntiClockWise(array); // Call printArrayAntiClockWise method with passing array as an argument.
        
    }
}