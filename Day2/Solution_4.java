import java.util.*;
import java.io.*;

public class Solution_4
{
    // divisible method with num as parameter and have boolean as return type.
    public static boolean divisible(int num){
        for(int i=1; i<=9; i++){
            if(num%i!=0) return false; // if number is not divisible by 1 to 9.
        }
        return true; // if number is divisible by all number between 1 to 9.
    }
    
	public static void main(String[] args) {
	    int num=1; // Declare and initialize the variable.
        // Execute while loop util get the desired output.
	    while(true){
	        if(divisible(num)){
	            System.out.println(num); // Print the smallest number divisible by all the number between 1 to 9.
	            break;
	        }
		    num++; // Increase the value of num for next iteration.
	    }
	    
		
	}
}
