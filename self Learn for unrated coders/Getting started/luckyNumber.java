//  TODO: Lucky Four Problem Code: LUCKFOUR

/*    
    Impressed by the power of this number, Kostya has begun to look for occurrences of four anywhere. He has a list of T integers, for each of them he wants to calculate the number of occurrences of the digit 4 in the decimal representation. He is too busy now, so please help him.
                
        Input
             ->The first line of input consists of a single integer T, denoting the number of integers in Kostya's list.

            Then, there are T lines, each of them contain a single integer from the list.

        Output
             ->Output T lines. Each of these lines should contain the number of occurences of the digit 4 in the respective integer from Kostya's list.

        Example - 
            Input:
             5
             447474
             228
             6664
             40
             81

            Output:
             4
             0
             1
             1
             0    
*/

import java.util.Scanner;

public class luckyNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int t = sc.nextInt();

            int rem = 0, count = 0;

            while(t > 0){
                rem = t % 10;
                if(rem == 4){
                    count++;
                }
                t = t/10;
            }
            System.out.println(count);
        }
        sc.close();
    }
}