package RockPaperScissor;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        String name1 = "Player 1", name2 = "Player 2";
        int P1 = 0, P2 = 0, Tie = 0;
        System.out.print("How Many GAMES You Want : ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int k = (t+1) - t;
        while (t-- > 0) {
            System.out.println("\n\t------Game Number : [" + (k++) + "]-------");
            Game p1 = new Game(name1);
            Game p2 = new Game(name2);
            if (p2.option.equals("Rock") && p1.option.equals("Paper")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equals("Paper") && p1.option.equals("Rock")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equals("Rock") && p1.option.equals("Scissor")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equals("Scissor") && p1.option.equals("Rock")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equals("Scissor") && p1.option.equals("Paper")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equals("Paper") && p1.option.equals("Scissor")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equals(p1.option)) {
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
