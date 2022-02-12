//  TODO: Id and Ship Problem Code: FLOW010

/*    
    Write a program that takes in a letterclass ID of a ship and display the equivalent string class description of the given ID. Use the table below.

    Class ID	Ship Class
     B or b	     BattleShip
     C or c	     Cruiser
     D or d	     Destroyer
     F or f	     Frigate
                
        Input
             ->The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains a character.

        Output
             ->For each test case, display the Ship Class depending on ID, in a new line.

        Example - 
            Input:
             3 
             b
             c
             d

            Output:
             BattleShip
             Cruiser
             Destroyer   
*/

import java.util.Scanner;

public class idAndShip {
    public static void main (String args[]) {

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);

            if (ch == 'b' || ch == 'B') {
                System.out.println("BattleShip");
            }

            if (ch == 'c' || ch == 'C') {
                System.out.println("Cruiser");
            }

            if (ch == 'd' || ch == 'D') {
                System.out.println("Destroyer");
            }

            if (ch == 'f' || ch == 'F') {
                System.out.println("Frigate");
            }
        }
        sc.close();
    }
}