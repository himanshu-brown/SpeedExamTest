import java.util.*;
import java.io.*;

class Solution_2 {
    
    public static boolean areDistinct(String str, int start, int end) {
        
        boolean[] visited = new boolean[26];
        
        for(int i=start; i<=end; i++) {
            if(visited[str.charAt(i)-'a'] == true) return false;
            
            visited[str.charAt(i)-'a'] = true;
            
        }
        
        return true;
        
    }
    
    public static int longestSubstring(String str) {
        
        int longSubstring = 1;
        for(int i=0; i<str.length()-1; i++) {
            for(int j=i+1; j<str.length(); j++) {
                if(areDistinct(str,i,j))
                    longSubstring = Math.max(longSubstring,j-i+1);
            }
        }
        
        return longSubstring;
        
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: "); 
        String str = scan.next();
        
        System.out.println(longestSubstring(str));
        
    }
}