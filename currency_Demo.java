/*
1. 2.
Write a program for the following-
a.
Define a Java class Currency with method convert() with the following definition:
double convert(double amount){
return amount;
}
b.
Define a subclass Dollar and a subclass Rupee of Currency
c.
In Rupee, override convert() to take an amount in dollars and return the amount
converted to rupee.
d.
Similarly, in Dollar, override convert() to take an amount in rupees and return the
amount converted to dollars.
e.
Define a static method driver() in Currency which takes input amount using Scanner
class and prints the amount converted to rupee then to dollar. Use only reference of
type Currency to display converted amount using convert().
f.
Create a public class Demo with the main function. In the main function, invoke driver()
method of Currency

Note: Use conversion rate 1 dollar = 73.55 rupee. Round off to 2 places after decimal while
printing.
Hint: dynamic binding
Input 1
Enter amount: 100
Output
100.00 dollar is 7355.00 rupee
100.00 rupee is 1.36 dollar
Input 2
Enter amount: 24.35
Output
24.35 dollar is 1790.94 rupee
24.35 rupee is 0.33 dollar
Input 3
Enter amount: 73.55
Output
73.55 dollar is 5409.60 rupee
73.55 rupee is 1.00 dollar
*/

import java.util.*;
class Currency {
	double convert(double amount){
		return amount;
	}
	
	static void driver(){
	    Scanner in_val = new Scanner(System.in);
	    double amount;
	    amount = in_val.nextDouble();
	    Currency obj1 = new Dollar();
	    System.out.printf("%.2f" + " dollars is" + " %.2f " + "rupee\n", amount, obj1.convert(amount));
	    Currency obj2 = new Rupee();
	    System.out.printf("%.2f" + " rupee is" + " %.2f " + "dollar\n", amount, obj2.convert(amount));
	}
}

class Dollar extends Currency{
    double convert(double amount){
        return amount*73.55;
    }
}

class Rupee extends Currency{
    double convert(double amount){
        return amount/73.55;
    }
}

public class currency_Demo{
    public static void main(String args[]){
        Currency.driver();
    }
}