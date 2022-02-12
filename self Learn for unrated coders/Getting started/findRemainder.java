//  TODO: Find Remainder| FLOW002

/* 
    write a program to find the remainder when an interger A is divided by an integer B.

    Input
    The first line contains an integer T, the total number of test cases. Then T lines follow, each line contains two Integers A and B.

    Output
    For each test case, find the remainder when A is divided by B, and display it in a new line.

    Example
            Input
             3 
             1 2
             100 200
             40 15

            Output
             1
             100
             10
*/
import java.util.Scanner;

public class findRemainder{
    public static void main (String args[]){

        int remainder = 0;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){

            int a = sc.nextInt();
            int b = sc.nextInt();

            remainder = a % b;
            System.out.println(remainder);
        }
        sc.close();
    }
}