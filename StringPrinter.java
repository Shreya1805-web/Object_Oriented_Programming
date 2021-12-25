/*

2. Define a class StringPrinter which extends Thread class with a data member s (string). Define a
parameterized constructor which takes a string as parameter and assigns its value to s.
Override run() to print all characters of s in separate lines, waiting for 3 seconds in between
each character. In the main function of StringPrinter, take two strings as input from the user and
declare a thread with each of the strings as parameters. Execute both the threads.

*/

import java.util.*;
public class StringPrinter extends Thread {
	String s;
	
	StringPrinter(String str){
		s = str;
	}
	
	public void run() {
		
			for(int i = 0; i < s.length(); i++){
				try {
					System.out.println(s.charAt(i));
					Thread.sleep(3000);
				}
				
				catch(Exception E) {
				System.out.println("Thread Interrupted");
				
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string:");
		String s1 = sc.nextLine();
		StringPrinter thread1 = new StringPrinter(s1);
		
		System.out.println("Enter second string:");
		String s2 = sc.nextLine();
		StringPrinter thread2 = new StringPrinter(s2);
		
		thread1.start();
		
		try{
			thread1.join();
		}
		catch(Exception E) {
			System.out.println("Thread Interrupted");
		}
		
		thread2.start();
		
	}

}