/*
1. Consider two parameterised constructors to perform computation on a series of numbers. First
constructor is to compute the sum of the numbers in a series whereas the second constructor
is to multiply and sum the numbers in a series.
In the case of the first constructor, the input number is the only parameter. If the input number
is odd then sum all the odd numbers below the input number (Odd Series). If the input number
is even then sum the even numbers below the input number (Even Series).
INPUT: 5
EXPECTED OUTPUT: 1+3+5=9
INPUT:6
EXPECTED OUTPUT: 2+4+6=12
In the case of the second constructor, input number and multiplier number are the
parameters. Before performing sum of the numbers in a respective series, multiply
each number in a series with the multiplier number.

*/

public class seriesSum{
    int sum = 0;
    seriesSum(int n){
        if(n%2!=0){
            for(int i = 1; i<=n; i=i+2){
                sum = sum + i;
                if(i==n) 
                    System.out.print(i);
                else 
                    System.out.print(i+"+");
            }
        }
        else{
            for(int i = 2; i<=n; i=i+2){
                sum = sum + i;
                if(i==n) 
                    System.out.print(i);
                else 
                    System.out.print(i+"+");
            }
        }
        System.out.println("="+sum);
        
    }
    seriesSum(int n , int m){
       if(n%2!=0){
            for(int i = 1; i<=n; i=i+2){
                sum = sum + i*m;
                if(i==n) 
                    System.out.print("("+i+"*"+ m+")");
                else 
                    System.out.print("("+i+"*"+ m+")"+ "+");
            }
        }
        else{
            for(int i = 2; i<=n; i=i+2){
                sum = sum + i;
                if(i==n) 
                    System.out.print("("+i+"*"+m+")");
                else 
                    System.out.print("("+i+"*"+m+")"+ "+");
            }
        }
        System.out.println("="+sum);
        
    }
    public static void main(String[] args){
        seriesSum s= new seriesSum(5);
        seriesSum s1= new seriesSum(5,2);
        seriesSum s2= new seriesSum(6);
        seriesSum s3= new seriesSum(6,2);
    }
}