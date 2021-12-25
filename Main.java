/*
1. Alice has 'a' candles. Each candle burns for one hour and then goes out. Alice, being a
smart person, can make a new candle from 'b' went out candles. This new candle can be
used like any other candle. Given 'a' and 'b', find the maximum number of hours Alice
can light the candles. Assume that the value of ‘b’ is strictly greater than 1.
Input 1
4 2
Output 1
7 // total number of hours that Alice can light the candles.
Explanation
She has 4 candles. After burning them, she can make 2 more candles from these four
went out candles. Now, she again has two went out candles. She can again use this to
make 1 more candle. Now, she cannot make more candles with this single went out
candle(she needs at least ‘2’ since the value of ‘b’ is 2).
Total: 4+2+1 = 7
Input 2
6 3
Output 2
8
Explanation
Initially, she has 6 candles. After burning these candles, she has 6 went out candles.
Now, she can use these candles to make new candles. According to the input, from ‘3’
went out candles, she can make one candle. So, she can make 2 more candles from 6
went out candles. Hence, she is left with 2 more candles. Now, from 2 candles, she
cannot make any more candles (she needs at least 3)

*/

import java.util.*;
class candle {
	int total_candles, per_new_candle;
	candle (int n, int m) {
		total_candles = n;
		per_new_candle = m;
	}
	
	void display_time()
	{   
	    
		int time;
		time = total_candles;
		while(total_candles >= per_new_candle){
		    time = time + total_candles / per_new_candle;
			total_candles = total_candles / per_new_candle + total_candles % per_new_candle;
			
		}
		
		System.out.println(time);
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		candle obj1 = new candle(num1,num2);
		obj1.display_time();
	}
}