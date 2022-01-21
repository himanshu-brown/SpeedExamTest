import java.util.*;
import java.io.*;

class Solution_1 {
    
    public static int countChar(String str, char ch) {
        int occurrence = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) occurrence++;
        }
        return occurrence;
    }
    
    public static String substring(String str, int start, int end) {
        String subString;
        for(int i=start; i<=end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
    
    public static String[] split(String str, char ch) {}
    
    public static boolean hasPattern(String str, String pattern) {
        int start1=0, start2=0;
        while(start1<str.length() && start2<pattern.length()) {
            if(str.charAt(start1) != pattern.charAt(start2)) {
                start1++;
                start2 = 0;
            }
            else if(str.charAt(start1) == pattern.charAt(start2)) {
                start1++;
                start2++;
            }
        }
        if(start2 == pattern.length()) return true;
        return false;
    }
    
    public static boolean allWordsContainsChar(String str, char ch) {
        for(int i=0; i<str.length(); i++) {
            if(ch != str.charAt(i)) return false;
        }
        return true;
    }
    
    public static String reverse(String str) {
        char temp = ' ';
        for(int i=0; i<str.length()/2; ) {
            temp = str.charAt(i);
            str.charAt(i) = str.charAt(str.length()-1-i);
            str.charAt(str.length()-1-i) = temp;
        }
        return str;
    }
    
    public static String reverseVowels(String str) {
        int start=0, end=str.length()-1,i=0,j=0;
        char ch[] = str.toCharArray();
        while(start < end){
            for(i=start; i<str.length(); i++){
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
                    start = i;
                    break;
                }
            }
            for(j=end; j>=0; j--){
                if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[i]=='o'||ch[j]=='u') {
                    end = j;
                    break;
                }
            }
            if(start<end){
                char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            }
            
            start++;
            end--;
        }
        String string = new String(ch);
        return string;
    }
    
    public static void main(String[] args) {
        String str = "liipcoce";
        System.out.println(reverseVowels(str)); 
    }
}