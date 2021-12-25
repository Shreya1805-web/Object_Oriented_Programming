/*

2. Reference problem 2:
You are given n lines. In each line there are zero or more integers. You need to answer a few
queries where you need to tell the number located in yth position of xth line.
Input
The first line has an integer n. In each of the next n lines there will be an integer d denoting the
number of integers on that line and then there will be d space-separated integers. In the next line
there will be an integer q denoting number of queries. Each query will consist of two integers x
and y denoting the line number and position of the number on the line.
Output
In each line, output the number located at a particular position from the given line. If there is no
such position, just print -1.
Note: Use dynamic size arrays (Java’s ArrayList) here.
Input:
5 (integer n)
5 41 77 74 22 44 (1st line)
1 12 (2nd line)
4 37 34 36 52 (3rd line)
0
3 20 22 33
5 (no of queries)
1 3 (find third number of first line)
3 4 (find fourth number of third line)
3 1
4 3
5 5
Output:
74
52
37
-1
-1

*/

import java.util.*;
public class ArrayQuestion2 {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList(n);
		
		int n1, x, y;
		for(int i = 0; i < n; i++){
			graph.add(new ArrayList<Integer>());
			n1 = sc.nextInt();
			for(int j = 0; j < n1; j++)
				graph.get(i).add(sc.nextInt());
		}
		
		int query_num = sc.nextInt();
		
		for(int i = 0; i < query_num; i++){
			x = sc.nextInt();
			y = sc.nextInt();
			try {
				System.out.println(graph.get(x-1).get(y-1));
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println(-1);
			}
		}
		sc.close();
	}

}
