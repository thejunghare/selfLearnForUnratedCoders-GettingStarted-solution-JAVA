/*
    TODO: 
        Input:
         ->The input begins with two positive integers n k (n, k<=107). 
           The next n lines of input contain one positive integer ti, not greater than 109, each.

        Output:
         ->Write a single integer to output, denoting how many integers ti are divisible by k.

        Example
            Input:
                7 3
                1
                51
                966369
                7
                9
                999996
                11
            Output:
                4 
*/

import java.util.Scanner;

public class enormusNumber{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++){
            int test_case = sc.nextInt();
            if (test_case % k == 0){
                count+=1;
            }
        }
        System.out.println(count);

        sc.close();
    }
}