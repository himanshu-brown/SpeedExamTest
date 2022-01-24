import java.util.*;
import java.io.*;

public class Solution_2
{
    // triplet method with array and target as parameter.
    public static void triplet(int[] array, int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(); // Declare 2D ArrayList.
        Arrays.sort(array); // Sort the array.
        int start=0, end=0; // Declare the variables.
        // Logic for finding the triplet.
        for(int i=0; i<array.length-2; i++){
            start=i+1;
            end=array.length-1;
            while(start<end){
                if(array[i]+array[start]+array[end]==target){
                    list.add(new ArrayList<Integer>(Arrays.asList(array[i],array[start],array[end])));
                    start++;
                    end--;
                }else if(array[start]+array[end]+array[i]>target) end--;
                else start++;
            }
        }
        System.out.print(list); // Print the desired output.
    }
    
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array : "); // Display a message.
		int size = scan.nextInt(); // Take size input from user.
		int[] array = new int[size]; // Declare array.
		System.out.print("Enter the values in an array : "); // Display a message.
        // Take array input from user.
		for(int index=0; index<size; index++){
		    array[index] = scan.nextInt();
		}
		System.out.print("Enter the target : "); // Display a message.
		int target = scan.nextInt(); // Take target input from user.
		triplet(array,target); // Call triplet method.
	}
}
