/*
Q1. Write a program which converts a floating point number represented in string. Define custom
exceptions FloatingPointException and InvalidNumberException
a. FloatingPointException occurs when -
i. There are more than one floating points
ii. There is a single floating point but no digits following it
b. InvalidNumberException occurs the entered number -
i. Is an empty string
ii. Starts with a zero which isn’t immediately followed by a floating point
FloatingPointException is to be given priority over InvalidNumberException, i.e., checks for
FloatingPointException come before InvalidNumberException.
Note: Integers are also valid floating point numbers
Input 1
3.45.12
Output
FloatingPointException: multiple floating points
Input 2
0234.23
Output
InvalidNumberException: number starts with zero
Input 3
// empty string or no input
Output
InvalidNumberException: empty string
Input 4
234.
Output
FloatingPointException: dangling floating point
Input 5
023.45.67
Output
FloatingPointException: multiple floating points
Explanation
Even though both exceptions occur, FloatingPointException is given more priority and hence
caught first
Input 6
12.34
Output
12.34
Explanation
It is a valid floating point number
Input 7
1234
Output
1234
Explanation
It is a valid floating point number
*/

import java.util.*;

class FloatingPointException extends Exception{
	FloatingPointException(String s){
		super(s);
	}
}

class InvalidNumberException extends Exception{
	InvalidNumberException(String s){
		super(s);
	}
}

public class floating_pt {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		try
		{
			for(int i=0;i<str.length();i++)
				if(str.charAt(i)=='.')
							count++;
			
			if(str.isEmpty())
				throw new InvalidNumberException("empty string");
			else if(str.charAt(str.length()-1)=='.')
				throw new FloatingPointException("dangling floating point");
			else if(count>1)
				throw new FloatingPointException("multiple floating points");
			else if(str.charAt(0)=='0' && str.charAt(1)!='.')
				throw new InvalidNumberException("number starts with zero");
			else
				System.out.println("It is a valid floating point number");
		}
		
		catch(FloatingPointException fpe){
			System.out.println(fpe);
		}
		catch(InvalidNumberException ine) {
			System.out.println(ine);
		}
		
	}
}