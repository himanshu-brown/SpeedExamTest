import java.util.*;
import java.io.*;

class Solution_3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int row=0, col=0, start=0, end=0;
        System.out.print("Enter the value of N: "); 
        int N = scan.nextInt();
        end = N-1;
        
        if(N % 2 != 0 && N > 4){
            
            for(row=0; row<N; row++){
                for(col=0; col<N; col++){
                    if(row == col) System.out.printf("\\");
                    else if(end==col) System.out.printf("/");
                    else System.out.printf("*");
                }
                System.out.println();
                end--;
            }
            
        }
        
    }
}