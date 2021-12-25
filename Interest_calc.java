/*
1. Q3. Define an abstract class Interest with data members principal (double), rate (double),
time_in_years (int) and interest (double) and abstract methods calculate() and print()
Define class SimpleInterest which extends Interest
a.
Define a parametrised constructor which takes principal, rate and time_in_years as
parameters
b.
Implement calculate() to calculate the interest using the formula
interest = principal * rate * time_in_years
Similarly, define class CompoundtInterest which extends Interest
c.
Define a parametrised constructor which taken principal, rate, and time_in_years as
parameters
d.
Implement calculate() to calculate the interest using the formula
interest = principal * ( ( 1 + rate ) ^ time_in_years ) - principal
Define class Main with main method. In main, use Scanner class to take principal, rate, time
in years as input from user. Print the interest payable with simple and compound interest and
the difference expressed as a percentage of the principal. Only use reference of type
Interest.
Note: Round off real values to 2 places after decimal while printing
Input 1
150000 0.02 3
Output
Interest payable with simple interest: 9000.00
Interest payable with compound interest: 9181.20
Difference: 0.12% of principal
Input 2
10000 0.01 15
Output
Interest payable with simple interest: 1500.00
Interest payable with compound interest: 1609.69
Difference: 1.10% of principal
*/

import java.util.Scanner;
import java.lang.Math;
abstract class Interest{
    double principal, rate, interest;
    int time_in_years;
    public abstract void calculate();
    public abstract void print();
}

class SimpleInterest extends Interest{
    SimpleInterest( double principal, int time_in_years, double rate){
        this.principal = principal;
        this.time_in_years = time_in_years;
        this.rate = rate;
    }
    
    public void calculate(){
        interest = principal * rate * time_in_years;
    }
    public void print(){
        System.out.printf("Interest payable with simple interest:  "+ "%.2f" + "\n", interest);

    }
}

class CompoundInterest extends Interest{
    CompoundInterest( double principal, int time_in_years, double rate){
        this.principal = principal;
        this.time_in_years = time_in_years;
        this.rate = rate;
    }
    
    public void calculate(){
        interest = principal * ( Math.pow(( 1 + rate ), time_in_years )) - principal;
    }
    public void print() {
        System.out.printf("Interest payable with compound interest:  "+ "%.2f" + "\n", interest);
    }
}

public class Interest_calc {
 public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double p = myObj.nextDouble();
        double r = myObj.nextDouble();
        int t = myObj.nextInt();
        SimpleInterest SI = new SimpleInterest(p,t,r);
        CompoundInterest CI = new CompoundInterest(p,t,r);
        SI.calculate();
        CI.calculate();
        SI.print();
        CI.print();
        double diff = (CI.interest - SI.interest )/p *100;
        System.out.printf("Difference:  "+ "%.2f" + "%% of principal\n", diff);
        
 }
}