//2. Write a Java program to display the Diameter, Circumference and Area of a circle.

import java.util.Scanner;  
import java.lang.Math.*;
public class circleProp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  
        int radius= sc.nextInt();
        int d = 2 * radius;
        double area = Math.PI * radius * radius;
        double circum = 2 * Math.PI * radius ;
        
        System.out.println("Diameter is: " + d);
        System.out.println("Area is: " + area);
        System.out.println("Circumference is: " + circum);

    }

}