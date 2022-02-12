//  TODO: First and Last Digit Problem Code: FLOW004

/*    
    If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.
                
        Input
             ->The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

        Output
             ->For each test case, display the sum of first and last digits of N in a new line.

        Example - Successful Transaction
            Input:
             3
             1234
             124894
             242323

            Output:
             5
             5
             5    
*/


import java.util.Scanner;

public class firstAndLastDigit{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int t = sc.nextInt();
            
            int fdigit = 0, ldigit = 0;
            ldigit = t % 10;

            while(t > 0){
                fdigit = t % 10;
                t = t / 10;
            } 
            System.out.println(fdigit + ldigit);
        }
    }
}