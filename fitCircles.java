/*
2. Given the length and breadth of a rectangle, a radius r and an integer n, determine if n
circles of radius r can be cut from a paper with dimensions same as that of the rectangle.
If yes, print ‘Yes’ else print ‘No’. Assume all dimensions are integers. Use double pi = 3.14 .
Generate output as shown:
Enter length: 10
Enter breadth: 15
Enter radius: 2
Enter number of circles: 4
Yes

*/

import java.util.Scanner;
public class fitCircles {
    
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length: ");
        int l = input.nextInt();

        System.out.println("Enter breadth: ");
        int b = input.nextInt();

        System.out.println("Enter radius: ");
        int r = input.nextInt();
        
        System.out.println("Enter number of circles: ");
        int n = input.nextInt();
        
        int d = 2 * r;
        double max_circles = l/d * b/d ;
        
        if(n <= max_circles)
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
