//TODO:   ATM Problem Code: HS08TEST

/*
    Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.

        Input:
            Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.

            Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.

        Output:
            Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.

        Example - Successful Transaction
            Input:
             30 120.00

            Output:
             89.50
*/

import java.util.Scanner;

public class Atm{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        double act_bl, sub_amt;
        int widthdraw;

        widthdraw = sc.nextInt();
        act_bl = sc.nextDouble();

        if(widthdraw % 5 == 0 && widthdraw <= act_bl - 0.5){
            sub_amt = ((act_bl - widthdraw) - 0.5);
            System.out.print(sub_amt);
        }else{
            System.out.print(act_bl);
        }
    }
}