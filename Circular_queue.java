/*
2. Q2. Define a class CircularQueue to implement a circular queue using an array. Implement the
following methods -
a. pop() to remove an element from the head of the queue. pop() should throw custom
underflow exception when there are no elements in queue to pop
b. push() to append an element at the end of the queue. push() should throw custom
overflow exception when there is no more space in the queue to push an element
c. print_queue() to print the contents of the queue in order from front to back of queue.
Print “Queue is empty” if the queue has no elements
In the main function, take size (<=200) of queue as input from user and create a CircularQueue
object. Repeatedly take input about which method to execute from the user - 0 for push() and 1
for pop(). If the user enters 0, take the value to be pushed as input. Stop taking input when the
user enters -1 and print the contents of the queue from front to back. Note: Handle all
exceptions in main function. In case of exception, print error message and continue
execution
Input 1
3
0 5
0 6
0 7
0 4
OverflowException: queue full
1
1
-1 // stop taking input and print
Output
7
Input 2
1
0 3
0 4
OverflowException: queue full
1
1
UnderflowException: queue empty
-1 // stop taking input and print
Output
Queue is empty
Input 3
5
0 4
0 3
0 9
0 6
0 2
1
1
0 7
0 1
-1 // stop taking input and print
Output
9 6 2 7 1
Explanation
Queue after pushing 4, 3, 9, 6, 2: 4 3 9 6 2
Queue after pop() is executed 2 times: 9 6 2
Queue after pushing 7, 1: 9 6 2 7 1

*/

import java.util.Scanner;

class OverflowException extends Exception {

    OverflowException(String s) {
        super(s);
    }
}

class UnderflowException extends Exception {

    UnderflowException(String s) {
        super(s);
    }
}

class Queue {
    int size;
    int queue[];
    int front = 0, rear = 0, curr_size = 0;

    Queue(int size) {
        this.size = size;
        queue = new int[size + 1];
    }

    void push(int x) {
        queue[front] = x;
        front++;
        curr_size++;
    }

    int pop() {
        int to_return = queue[0];
        for (int i = 0; i < front - 1; i++)
            queue[i] = queue[i + 1];
        front--;
        curr_size--;
        return to_return;
    }

    void print() {
        if (curr_size == 0)
            System.out.print("Queue is empty");
        else
            for (int i = 0; i < front; i++) {
                System.out.print(queue[i] + " ");
            }
    }

}

public class Circular_queue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue(n);
        int p = sc.nextInt();
        while (p != -1) {
            if (p == 1) {
                if (q.curr_size == 0) {
                    try {
                        throw new UnderflowException("queue empty");
                    }
                    catch (Exception e) {
                        System.out.println("UnderflowException: " + e.getMessage());
                    }
                } 
                else {
                    q.pop();
                }
            } 
            else if (p == 0) {
                int x = sc.nextInt();
                if (q.curr_size >= q.size) {
                    try {
                        throw new OverflowException("queue full");
                    }
                    catch (Exception e) {
                        System.out.println("OverflowException: " + e.getMessage());
                    }
                }
                else {
                    q.push(x);
                }
            }
            p = sc.nextInt();
        }
        q.print();
        sc.close();
    }
}
