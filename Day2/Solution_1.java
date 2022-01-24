import java.util.*;
import java.io.*;

class Solution_1{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i=0, size=0, iterat=0;
        int[] array;
        System.out.print("Enter the size of an array: ");
        size = scan.nextInt();
        array = new int[size];
        int[] result = new int[size];
        System.out.print("Enter the value in an array: ");
        for(i=0; i<size; i++){
            array[i] = scan.nextInt();
        }
        // Display a message
        System.out.println("Original Array: ");
        for(i=0; i<size; i++){
            System.out.print(array[i]+" ");
        }
        
        Arrays.sort(array);
        i=0;
        iterat = 1;
        int store = -1;
        while(iterat<size){
            
            if(array.length == 1) {
                result[0] = array[0];
                break;
            }
            if(array[i] != array[iterat]) {
                result[++store] = array[i];
                i++;
                iterat++;
            }
            if(iterat<size && array[i] == array[iterat]) {
                i = iterat+1;
                iterat += 2;
            }
        }
        
        if(i!=iterat) result[++store] = array[i];
        
        System.out.println("\nArray after remove duplicates from an array: ");
        
        for(iterat=0; iterat<=store; iterat++)
            System.out.print(result[iterat]+" ");
        
    }
}
