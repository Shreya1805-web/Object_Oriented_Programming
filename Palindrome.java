/*
1.
Given a string str, find and print the length of the longest palindromic substring in str.
Substring of a string str is str[i...j] where 0 <= i <= j < length of string str
A string is said to be palindrome if the reverse of the string is the same as the string. For example,
“abba” is palindrome, but “abbc” is not palindrome.
Test case 1
cabad
Output
3
Test case 2
anna
Output
4
Test case 3
abcdef
Output
1
Explanation
We have 6 substrings of length 1 which are palindromes - “a”, “b”, “c”, “d”, “e”, “f”. So, the length
of the longest substring which is palindrome is 1.
*/

import java.util.*;

public class Palindrome {
  
    static int longestPalSubstr(String str){
        
        int n = str.length();
     
        int maxLen = 1, start = 0;
     
       
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;
     
             
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;
     
           
                if (flag!=0 && (j - i + 1) > maxLen) {
                    start = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return maxLen;
    }
  
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            String str= sc.nextLine();
            System.out.print(longestPalSubstr(str));
            
    }
}