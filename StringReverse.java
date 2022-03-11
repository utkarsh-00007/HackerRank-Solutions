/*
Problem Statement : Java String Reverse
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes
 */
import java.io.*;
import java.util.*;

public class Solution14 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        boolean a= false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(s.length()-i-1)){
                a= true;
            }
            else {
                a=false;
            }
        }

        if (a==true){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
