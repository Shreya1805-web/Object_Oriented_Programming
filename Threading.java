/*

1. Create a class Hello which extends Thread. Declare a global variable ‘num’. Define a
constructor which takes an integer and initializes ‘num’ to it. This class overrides - public void
run and prints “Hello\n” ‘num’ times.
Create a class Bye which extends Thread. Declare a global variable ‘num’. Define a constructor
which takes an integer and initializes ‘num’ to it. This class overrides - public void run and prints
“Bye\n” ‘num’ times.
Create a Main class which takes a positive integer ‘n’ from the user. It also creates an object of
Hello and Bye passing ‘n’. Now, the program should print ‘Hello’ and ‘Bye’ alternatively.
Refer to sample input/output for better understanding. At the end, print “Goodbye”. Also, ensure
that the main thread is the last one to finish. You can use the ‘sleep’ method to ensure printing
of the pattern. The value of ‘n’ would be less than 10.
Input 1
1
Output
Hello
Bye
Goodbye
Input 2
2
Output
Hello
Bye
Hello
Bye
Goodbye
Input 3
4
Output
Hello
Bye
Hello
Bye
Hello
Bye
Hello
Bye
Goodbye

*/

import java.util.*;

class Hello extends Thread{
    int num;
    Hello(int n){
        num = n;
    }
    public void run(){
        try{
            for(int i = 0; i < num; i++){
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){}
    }
    
}
class Bye extends Thread{
    int num;
    Bye(int n){
        num = n;
    }
    public void run(){
        try{
            for(int i = 0; i < num; i++){
                System.out.println("Bye");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie){}
    }
}

public class Threading{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    Hello thread1 = new Hello(n);
	    Bye thread2 = new Bye(n);
	    thread1.start();
	    thread2.start();
	    try{ 
            thread2.join(); 
        }
        catch(Exception e){}
        
	    System.out.println("Goodbye");
	}
}