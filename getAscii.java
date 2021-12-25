//1. Write a Java program to display the ASCII value of a character.

import java.util.Scanner;  
public class getAscii {  
    public static void main(String args[]){  
        //System.out.print("Enter a character: ");  
        Scanner sc = new Scanner(System.in);  
        char chr = sc.next().charAt(0);  
        int asciiValue = chr;  
        System.out.println(asciiValue);  
    }  
}  
