import java.util.*;
import java.io.*;

// Notes class
class Notes{

    int[] notes = {2000,500,200,100}; // Declare an array of notes.
    static int totalAmount = 10000000; // Declare static variable.

}

class ATM extends Notes{

    // withdraw method
    void withdraw(int withdrawAmount){

        if(withdrawAmount <= 0) System.out.println("Invalid Withdraw Amount");
        else if(withdrawAmount > totalAmount) System.out.println("Insufficient balance");
        else{
            int amountLeft = 0, index=0;
            while(withdrawAmount > 0){
                int noOfNotes = withdrawAmount/notes[index];
                withdrawAmount = withdrawAmount%notes[index];
                System.out.println("Collect notes of "+notes[index]+" : "+noOfNotes);
                index++;
            }
        }


    }

}

public class Solution_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ATM atm = new ATM(); // Create ATM object.
        // Execute while loop until user don't want withdraw.
        while(true){
            System.out.print("Do you want to withdraw : "); // Display a message.
            char withdrawPermission = scan.next().charAt(0); // Character input from user.
            if(withdrawPermission=='N' || withdrawPermission=='n') {
                System.out.println("Thanks for using ATM Machine"); // Display a message.
                break;
            }
            System.out.print("Enter withdraw amount : "); // Display a message.
            int withdrawAmount = scan.nextInt(); // Taking withdraw amount from user.

            atm.withdraw(withdrawAmount); // Call withdraw method.
        }
    }  
}
