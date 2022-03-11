/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth b and height h. You should read the variables from the standard input.

If b<= 0 or h<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains b: the breadth of the parallelogram. The next line contains h: the height of the parallelogram.

Constraints
-100 <= b <= 100
-100 <= h <= 100

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
 */

import java.util.Scanner;

public class Solution15 {
    static int b,h;
    static boolean flag = true;
    static{
        Scanner sc= new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        try {
            if (b<1||h<1) {
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
            System.exit(0);
        }
    }
    public static void main(String[] args) throws Exception{
        if(flag){
            int area=b*h;
            System.out.print(area);
        }
    }
}
