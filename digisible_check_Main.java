/*
2. A number is said to be "digisible" if it meets the following two conditions:It has no 0 and
it is divisible by each of its digits. Given an input integer N, print the count of all numbers
between 1 and N (inclusive) which are digisible.
Input 1
10
Output 1
9 //the count of all digisible numbers between 1 and 10
Explanation
All numbers 1 to 9 divide themselves, 10 is not digisible as it has ‘0’ digit
Input 2
13
Output 2
11 //the count of all digisible numbers between 1 and 13
Explanation:
Numbers 1 to 9, 11 and 12. 13 is not digisible as 3 doesn’t divide 13
*/

import java.util.*;
class digisible_check {
	int num;
	digisible_check(int n){
		num = n;
	}
	
	int count_digisible(){
		int count = 0;
		for(int i=1; i<=num; i++){
			int x = i;
			while(x>=0){
				if(x%10==0)
					break;
				if(i%(x%10)!=0)
					break;
				if(x/10<1){	
					count++;
				}
				x = x/10;
			}
		}
		System.out.println(count);
		return count;
	}
}

public class digisible_check_Main {
	public static void main(String[] args) {
		Scanner in_val = new Scanner(System.in);
		int x;
		x=in_val.nextInt();
		digisible_check obj1 = new digisible_check(x);
		obj1.count_digisible();
	}
}
