//  TODO:   Chef And Operators Problem Code: CHOPRT

/*    
    Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
    Relational Operators are operators which check relatioship between two values. Given two numerical values A and B you need to help chef in finding the relationship between them that is,
                
        Input
             ->First line contains an integer T, which denotes the number of testcases. Each of the T lines contain two integers A and B.

        Output
             ->For each line of input produce one line of output. This line contains any one of the relational operators'<' , '>' , '='
*/

import java.util.Scanner;

public class chefAndOperators{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1 > num2){
                System.out.println(">");
            }else if(num1 < num2){
                System.out.println("<");
            }else if (num1 == num2){
                System.out.println("=");
            }
        }
        sc.close();
    }
}