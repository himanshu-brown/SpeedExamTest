import java.util.*;
import java.io.*;

public class Solution_3 {

    // isPrime method which take a number as parameter and have boolean return type.
    public static boolean isPrime(int check){
        // Execute while loop until the value of check is not null.
        while(check != 0){
            int temp = check%10; // Get the last digit from the checkNum.
            // Check whether digit is prime or not.
            for(int i=2; i<=temp/2; i++){
                if(temp%i==0) return false; // Return false if digit is not prime.
            }
            check /= 10;
        }
        return true; // Return true if digit is prime.
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of N : "); // Display a message.
        int N = scan.nextInt(); // Take the value of N from the user.
        int checkNum = N-1; // Declare checkNum variable and initialize with N-1.
        // while loop for finding the largest number less than N whose each digit is prime number.
        while( checkNum > 0 ) {
            if(isPrime(checkNum)) { // if each digit is prime number.
                System.out.print("Largest number less than "+N+" whose each digit is prime number : "+checkNum);
                break; // Break the loop when we get the desired result.
            }
            checkNum--;
        }
    }
    
} 
