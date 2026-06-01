package DiceRoll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1 = "Player 1", name2 = "Player 2";
        int P1 = 0, P2 = 0, Tie = 0;
        System.out.print("How Many GAMES You Want : ");
        int t = scan.nextInt();

//        System.out.print("Player 1, Enter Your Name : ");
//        String name1 = scan.next();
//        System.out.print("Player 2, Enter Your Name : ");
//        String name2 = scan.next();

        while (t-- > 0) {
            System.out.println("\n\t------Game Number : [" + (t + 1) + "]-------");
            Dice p1 = new Dice(name1);
            Dice p2 = new Dice(name2);

            if (p1.number > p2.number) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p1.number < p2.number) {
                System.out.println(name2 + " wins");
                P2++;
            } else {
                System.out.println("Game Tie");
                Tie++;
            }
        }
        System.out.println("\n------------------[ GAME-MENU ]-----------------------");
        System.out.println("\tTotal Games Won By Player 1 : " + P1);
        System.out.println("\tTotal Games Won By Player 2 : " + P2);
        System.out.println("\tTotal Tie Games : " + Tie);
        if (P1 > P2)
            System.out.println("\tPlayer 1 Wins");
        else if (P1 < P2)
            System.out.println("\tPlayer 2 Wins");
        else
            System.out.println("\tGame Tie");
        System.out.println("---------------------------------------------------------");
    }

}
