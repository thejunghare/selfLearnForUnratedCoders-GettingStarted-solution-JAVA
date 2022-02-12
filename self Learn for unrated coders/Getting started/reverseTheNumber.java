//  TODO: Reverse The Number| FLOW007

/* 
    Given an Integer N, write a program to reverse it.

    Input
    The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer N.

    Output
    For each test case, display the reverse of the given number N, in a new line.

    Example
            Input
             4
             12345
             31203
             2123
             2300

            Output
             54321
             30213
             3212
             32
*/

import java.util.Scanner;

public class reverseTheNumber{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int t = sc.nextInt();

            int remainder = 0, reversed = 0;
            while(t != 0){
                remainder = t % 10;
                reversed = ((reversed * 10) + remainder);
                t = t / 10;
            } 
            System.out.println(reversed);
        }
        sc.close();
    }
}