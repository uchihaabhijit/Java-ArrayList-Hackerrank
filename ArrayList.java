/*

Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line. 

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer
denoting number of integers on that line and then there will be space-separated integers. 
In the next line there will be an integer denoting number of queries. Each query will consist of two integers.

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
        
       for( int i = 0; i<n; i++ ) {
          int a = s.nextInt();
           ArrayList<Integer> node = new ArrayList<>();
           for( int j =0; j<a; j++ ) {
               node.add(s.nextInt());
           }
           
           nodes.add(node);
       }
        
        int q = s.nextInt();
        int k = 0;
        while( k<q ) {
            int q1 = s.nextInt();
            int q2 = s.nextInt();
            try {
                System.out.println(nodes.get(q1-1).get(q2-1));    
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
            
            
            k++;
        }
        
    }
}
