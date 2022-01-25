import java.util.*;
import java.io.*;

class Main {
    
    public static int countChar(String str, char ch) {
        int occurrence = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == ch) occurrence++;
        }
        return occurrence;
    }
    
    public static String substring(String str, int start, int end) {
        String subString = "";
        for(int i=start; i<=end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }
    
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
        char[] characterArray = new char[str.length()];
        characterArray = str.toCharArray();
        for(int i=0; i<str.length()/2; i++) {
            temp = characterArray[i];
            characterArray[i] = characterArray[str.length()-1-i];
            characterArray[str.length()-1-i] = temp;
        }
        String string = new String(characterArray);
        return string;
    }
    
    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }
    
    public static String reverseVowels(String str) {
        int start = 0;
        int end = str.length()-1;
        char[] str1 = str.toCharArray();
        while (start < end)
        {
        if (!isVowel(str1[start]))
        {
            start++;
            continue;
        }
        if (!isVowel(str1[end]))
        {
            end--;
            continue;
        }
        char t = str1[start];
        str1[start]= str1[end];
        str1[end]= t;
         
 
        start++;
        end--;
    }
    String str2 = String.copyValueOf(str1);
    return str2;
    }
    
    public static void main(String[] args) {
        String str = "liipcoce";
        System.out.println(countChar("liipcoce",'i'));
        System.out.println(substring("liipcoce",1,4));
        System.out.println(hasPattern("liipcoce","iip"));
        System.out.println(allWordsContainsChar("hhhh",'h'));
        System.out.println(reverse("apple"));
        System.out.println(reverseVowels(str)); 
    }
}