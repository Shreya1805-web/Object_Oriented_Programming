/*
1. Reference problem 1:
Take an array of length n where all the numbers are nonnegative and unique. Find the element
in the array possessing the highest value. Split the highest element into two parts where the first
part contains the second highest value in the array and the second part holds the required additive
entity to get the highest value. Print the array where the highest value gets splitted into those two
parts.
Sample input: 4 7 6 3 2
Sample output: 4 6 1 6 3 2
Explanation: In the above main array the highest element is 7 and second highest element is 6.
So, split the highest element (7) such that highest_element (7)= second_highest_element (6) +
additive(1). And then, in place of the highest_element that split part (second highest element and
additive) is to be stored in the main array.
*/

import java.util.*;  
public class ArrayQuestion1{  
    public static void main(String[] args){
        List<Integer> A = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int i = 0, max = -1, secondmax = -1, maxPos = -1;
        while (s.hasNextInt()) {
            A.add(s.nextInt());
            if(max <= A.get(i)) { secondmax = max; max = A.get(i); maxPos = i;}
            else if(A.get(i) > secondmax) { secondmax = A.get(i);}
            i++;
        }
        A.remove(maxPos);
        A.add(maxPos, secondmax);
        A.add(maxPos+1, max - secondmax);
        for ( i = 0; i < A.size(); i++)
            System.out.print(A.get(i) + " ");
        
    }
    
}