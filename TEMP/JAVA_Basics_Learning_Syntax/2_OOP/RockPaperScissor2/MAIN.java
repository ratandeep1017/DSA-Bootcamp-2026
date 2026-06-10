package RockPaperScissor2;

import java.util.Scanner;
class MAIN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name1, name2 = "Computer";
        int P1 = 0, P2 = 0, Tie = 0;
        System.out.print("Please Enter your name : ");
        name1 = scan.next();
        System.out.print("How Many GAMES You Want to play : ");
        int t = scan.nextInt();
        int k = 1;
        while (t-- > 0) {
            System.out.println("\n\t------Game Number : [" + (k++) + "]-------");
            Game p1 = new Game();
            System.out.print("your choice : ");
            p1.option = scan.next();
            Game p2 = new Game(name2);
            if (p2.option.equalsIgnoreCase("Rock") && p1.option.equalsIgnoreCase("Paper")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equalsIgnoreCase("Paper") && p1.option.equalsIgnoreCase("Rock")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equalsIgnoreCase("Rock") && p1.option.equalsIgnoreCase("Scissor")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equalsIgnoreCase("Scissor") && p1.option.equalsIgnoreCase("Rock")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equalsIgnoreCase("Scissor") && p1.option.equalsIgnoreCase("Paper")) {
                System.out.println(name2 + " wins");
                P2++;
            } else if (p2.option.equalsIgnoreCase("Paper") && p1.option.equalsIgnoreCase("Scissor")) {
                System.out.println(name1 + " wins");
                P1++;
            } else if (p2.option.equalsIgnoreCase(p1.option)) {
                System.out.println("Game Tie");
                Tie++;
            }
        }
        System.out.println("\n------------------[ GAME-MENU ]-----------------------");
        System.out.println("\tTotal Games Won By " + name1 + " : " + P1);
        System.out.println("\tTotal Games Won By Computer : " + P2);
        System.out.println("\tTotal Tie Games : " + Tie);
        if (P1 > P2)
            System.out.println("\n\tWinner is " + name1);
        else if (P1 < P2)
            System.out.println("\n\tWinner is Computer");
        else
            System.out.println("\n\tGame Tie");
        System.out.println("---------------------------------------------------------");
    }
}
