/*
2. 3. Write a program to implement multilevel inheritance. Define classes for different levels as
given -
FirstLevel
Data members - int val = 0
Methods - add(), print()
SecondLevel extends FirstLevel
Data members - int val = 0
Methods - add(), print()
ThirdLevel extends SecondLevel
Data members - int val = 0
Methods - add(), print(), driver()
Specifications -
add() takes one integer n as parameter, adds n to val of the current level and adds 2*n to val
of its previous level
print() prints the values of all previous levels and the current level in the following format:
firstLevelVal-->secondLevelVal-->thirdLevelVal
driver() takes positive integer input for value to be added using Scanner class. Stop taking
input when a negative number is entered by the user and print final values of all levels using
print()
Create a public class Demo with the main functions. In main function, create an object of type
ThirdLevel and invoke driver()
Hint: super keyword
Input 1
Enter value to be added: 5
Enter value to be added: 10
Enter value to be added: 15
Enter value to be added: -5
Output
Final state is:
120-->60-->30
Explanation
After 5 is added:
20-->10-->5
After 10:
60-->30-->15
After 15:
120-->60-->30
Input 2
Enter value to be added: 100
Enter value to be added: 20
Enter value to be added: -9
Output
Final state is:
480-->240-->120
Input 3
Enter value to be added: 10
Enter value to be added: -1
Output
Final state is:
40-->20-->10

*/

import java.util.*;
class FirstLevel{
    int val = 0;
    void Add(int n){
        val=val+n;
    }
    void print(){
        System.out.print("Final state is:\n");
        System.out.print(val + "-->");
    }
}

class SecondLevel extends FirstLevel{
    int val = 0;
    void Add(int n){
        val=val+n;
        super.Add(n*2);
    }
    void print(){
        super.print();
        System.out.print(val + "-->");
    }
}

class ThirdLevel extends SecondLevel{
     int val = 0;
    void Add(int n){
        val=val+n;
        super.Add(n*2);
    }
    void print(){
        super.print();
        System.out.print(val);
    }
    void driver(){
        Scanner input_val = new Scanner(System.in);
        int num;
        System.out.print("Enter value to be added:");
        num=input_val.nextInt();
        while(num>0){
            Add(num);
            System.out.print("Enter value to be added:");
            num=input_val.nextInt();
        }
        print();
    }
}

public class Levels_class
{
    public static void main(String args[])
    {
        ThirdLevel obj = new ThirdLevel();
        obj.driver();
    }
}