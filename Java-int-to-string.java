/*
Problem statement 9: Java Int to String
You are given an integer n, you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".

n can range between -100 to 100 inclusive.

Sample Input 0

100
Sample Output 0

Good job
 */
import java.io.*;
import java.util.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String s=String.valueOf(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer.");
        }

    }
}
