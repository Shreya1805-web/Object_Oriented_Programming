/*
2. Q5.
Create an interface 'Set' which declares following members -
- public void add(int item)
- public void clear()
- public boolean isEmpty()
- public int elementAtPosition(int position)
Create a class HashSet which implements interface 'Set' and also has following members -
- an array of size 100 to store the elements of the set
- int count - which is initialized to 0 and keeps a count of the number of elements the
set
- public void add(int item) - adds 'item' to the set.
- public void clear() - clears the set
- public boolean isEmpty() - return true if the set is empty else false
- public int elementAtPosition(int position) - Since a hashset does not store the
elements in the sorted order, return -1

Create another class TreeSet which implements interface 'Set' and also has following
members -
-an array of size 100 to store the elements of the set
-int count - which is initialized to 0 and keeps a count of the number of elements the
set
- public void add(int item) - adds 'item' to the set and also sorts it.
- public void clear() - clears the set
- public boolean isEmpty() - return true if the set is empty else false
- public int elementAtPosition(int pos) - returns the element at position 'pos' in the
set(which is sorted in this case). If 'pos' is greater than the number of elements in the
set, return -1
Create a class 'Main' and a 'main' function. Inside this main function, take an integer input
which would either be 0 or 1. 0 means it is a TreeSet else Hashset. Create an object of the
class accordingly if it is a TreeSet or HashSet.
Then, take an integer 'n' denoting the number of operations in the set.
An operation would be recognized by an integer. If it is -
1 - add an item to the set. Take another integer which would be the item to be
added(Assume these integers are positive).
2 - clear the set
3 - check if it is empty or not. Print 1 if it is empty else print 0
4 - calls elementAtPosition(int position). Take another integer which would be the
position at whose elements needs to be returned. Print the integer at that position as
well.
Note that the sorting can be done in any way without taking time complexity into
consideration. The number of elements at any point would be less than equal to 100.
Input 1
0
5
1 5
1 4
1 3
1 2
4 1
Output
2
Explanation
The first line of the input is 0 indicating it is a TreeSet
The second line gives the number of operations which is 5 in this case
So, the next five lines are the operations
The first operation is “1 5”. 1 means that it is an add operation and the item to be added is 5.
The second operation is “1 4”. 1 means that it is an add operation and the item to be added
is 4.
The third operation is “1 3”. 1 means that it is an add operation and the item to be added is
3.
The fourth operation is “1 2”. 1 means that it is an add operation and the item to be added is
2.
The fifth operation is “4 1”. 4 means that we need to call elementAtPosition(int position) and
1 is the position at which we need to print the value. Since it is a TreeSet which is sorted, the
set becomes {2, 3, 4, 5} and the first element is ‘2’. So, the output is 2 corresponding to this
last operation.
Input 2
1
5
1 5
1 4
1 3
1 2
4 1
Output
-1
Input 3
0
5
2
3
1 3
1 10
4 3
Output
1
-1
*/

import java.util.*;
interface Set
{
    public void add(int item);
    public void clear();
    public boolean isEmpty();
    public int elementAtPosition(int position);
}

class HashSet implements Set
{
    int[] arr = new int[100];
    int count=0;
    public void add(int item){
        arr[count]=item;
        count++;
    }
    public void clear(){
        for(int i=count-1;i>=0;i--){
            arr[i]=0;
        }
        count=0;
    }
    public boolean isEmpty(){
        for(int i=0;i<100;i++){
            if(arr[i]==0)
                continue;
            
            else
                return false;
            
        }
        return true;
    }
    public int elementAtPosition(int position)
    {
        return -1;
    }
}

class TreeSet implements Set{
    int[] arr = new int[100];
    int count=0;
    public void add(int item){
        if(count>0){
            arr[count]=item;
            for(int i=count-1;i>=0;i--){
                if(arr[i]<=arr[i+1])
                    break;
               
                else{
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i]=temp;
                    continue;
                }
            }
        }
        else
        {
            arr[count]=item;
        }
        count++;
    }
    public void clear(){
        for(int i=count-1;i>=0;i--){
            arr[i]=0;
        }
        count=0;
    }
    public boolean isEmpty(){
        for(int i=0;i<100;i++)
        {
            if(arr[i]==0)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public int elementAtPosition(int position){
        if(position<100 && position<count){
            return arr[position];
        }
        else{
            return -1;
        }
    }
}

public class sets
{
	public static void main(String[] args) 
	{
	    Scanner input_val = new Scanner(System.in);
	    int x;
	    x = input_val.nextInt();
	    if(x==0)
	    {
	        TreeSet obj = new TreeSet();
	        int n=input_val.nextInt();
	        int num;
	        for(int i=0;i<n;i++)
	        {
	            num=input_val.nextInt();
	            if(num==1)
	            {
	                int item;
	                item=input_val.nextInt();
	                obj.add(item);
	            }
	            else if(num==2)
	            {
	                obj.clear();
	            }
	            else if(num==3)
	            {
	                if(obj.isEmpty())
	                {  System.out.println("1");}
	                else
	                {  System.out.println("0");}
	            }
	            else if(num==4)
	            {
	                int pos;
	                pos=input_val.nextInt();
	                obj.elementAtPosition(pos-1);
	                System.out.println(obj.elementAtPosition(pos-1));
	            }
	        }
	    }
	    else if(x==1)
	    {
	        HashSet obj = new HashSet();
	        int n = input_val.nextInt();
	        int num;
	        for(int i=0;i<n;i++){
	            num=input_val.nextInt();
	            if(num==1){
	                int item;
	                item=input_val.nextInt();
	                obj.add(item);
	            }
	            else if(num==2){
	                obj.clear();
	            }
	            else if(num==3){
	                if(obj.isEmpty())
	                {  System.out.println("1");}
	                else
	                {  System.out.println("0");}
	            }
	            else if(num==4){
	                int pos;
	                pos=input_val.nextInt();
	                obj.elementAtPosition(pos-1);
	                System.out.println(obj.elementAtPosition(pos-1));
	                break;
	            }
	        }
	    }
	    else{
	        System.out.println("\nPLEASE CHOOSE 1 OR 0 AS INPUT");
	    }
	}
}