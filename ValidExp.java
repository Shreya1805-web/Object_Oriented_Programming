/*
2.
An expression is valid if it satisfies all the following conditions -
- It can be blank means nothing is entered
- It will always start with an operator + or - or * or / and will always be followed by a number
that can have any number of digits. This number can be a decimal(contains . in between
the numbers) or an integer(no '.' symbol within the number). examples : *0.6 , +12.34 , -
70 , / 0.68766
- It can be then followed by what is mentioned in point 2 (above line). examples : *0.6+2 ,
+12.34*1/42.73 , -70+87.52/99 , /0.68766/2+5.67
Given an expression, check if it is valid or not using java regex. Print “YES” if valid else print “NO”
Test case 1
*0.6+2
Output
YES
Test case 2
0.6+2
Output
NO
Test case 3
*0.6+2 *0.6+2 *0.6+2 *0.6+2 *0.6+2 *0.6+2
Output
YES
*/

import java.util.regex.*;
import java.util.*;

public class ValidExp {
  
    public static boolean isValidExp(String expression){
 
        String regex = "^$|^(([[+-][*/]][\\d]*[[[\\d+]+[\\.\\d+]]]*)*)";
  
        
        Pattern p = Pattern.compile(regex);
  
        if (expression == null) {
            return false;
        }
  
        Matcher m = p.matcher(expression);
  
        return m.matches();
    }
  
  
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
  
        if(isValidExp(str))
            System.out.println("YES");
        else
            System.out.println("NO");
  
        
    }
}