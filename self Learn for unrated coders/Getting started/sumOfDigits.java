//  TODO: Sum of Digits| FLOW006

/* 
    You're given an integer N. Write a program to calculate the sum of all the digits of N.

    Input
    The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.

    Output
    For each test case, calculate the sum of digits of N, and display it in a new line.

    Example
            Input
             3 
             12345
             31203
             2123

            Output
             15
             9
             8
*/
import java.util.Scanner;

public class sumOfDigits{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            int remainder = 0, sum = 0;

            while(t != 0){
                remainder = t % 10;
                t = t / 10;
                sum = sum + remainder;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}