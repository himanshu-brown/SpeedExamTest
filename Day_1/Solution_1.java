import java.util.*;
import java.io.*;

class Solution_1 {
    
    public static boolean isNameValid(String name){
        
        int vowel = 0, begin=0, end=0;
        boolean valid = true;
        for(int i=0; i<name.length(); i++){
            
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') vowel ++;
            
        }
        
        for(int i=0; i<name.length(); i++) {
            if(name.charAt(i) == 'S') {
                begin = i;
                break;
            }
        }
        for(int i=name.length()-1; i>=0; i--) {
            if(name.charAt(i) == 'S') {
                end = i;
                break;
            }
        }
        
        while(begin < end){
            
            if(name.charAt(begin++) == 'T') {
                valid = false;
                break;
            }
            
        }
        
        if(vowel<=1 && valid) return true;
        return false;
        
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scan.next();
        
        if(isNameValid(name))
            System.out.println("Given name is valid"); 
        else
            System.out.println("Given name is not valid");
    }
}