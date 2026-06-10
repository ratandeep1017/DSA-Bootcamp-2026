


package TicTacToe3;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class TicTacToe {
    static Scanner scan = new Scanner(System.in);
    static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    static int row, col;


    public static void main(String[] args) {

        play();
    }

    static void play() {
        Random random = new Random();
        System.out.print("Player \"X\" Enter Your name : ");
        String Player1 = scan.next();
        System.out.print("Player \"O\" Enter Your name : ");
        String Player2 = scan.next();
        int count = 1;
        boolean play = true;
        char turn = 'X';
        String name = Player1;
        printing();
        if (Winner()) {
            play = false;
            printing();
            System.out.println("\t    " + name + " WINS!");
        } else if (count == 5) {
            play = false;
            printing();
            System.out.println("GAME TIE");
        }
        while (play) {
            System.out.println("\t\t [ " + name + "'s ] Turn");
            if (turn == 'X') {
                row = scan.nextInt() - 1;
                col = scan.nextInt() - 1;
                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                    System.out.println("\n[WRONG INPUT] so, Enter Input Again\n");
                    continue;
                }
                board[row][col] = turn;
                turn = 'O';
                name = Player2;
            } else {
                do {
                    row = random.nextInt(3);
                    col = random.nextInt(3);
                } while (Winner());
                if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
                    System.out.println("\n[WRONG INPUT] so, Enter Input Again\n");
                    continue;
                }
                board[row][col] = turn;
                turn = 'X';
                name = Player1;
                count++;
            }

            printing();
        }
    }


    static void printing() {
        System.out.println("---------------------------------------------");
        System.out.println("\t   | 1 | 2 | 3 |");
        System.out.println("\t   | 4 | 5 | 6 |");
        System.out.println("\t   | 7 | 8 | 9 |");
        System.out.print("\n\t   -------------");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0)
                    System.out.print("\t   | ");
                System.out.print(board[i][j] + " | ");
            }
        }
        System.out.println();
        System.out.println("\t   -------------");
    }

    static boolean Winner() {
        // check rows
        for (int i = 0; i < 3; i++)
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ')
                return true;
        // check columns
        for (int j = 0; j < 3; j++)
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ')
                return true;
        //check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ')
            return true;
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')
            return true;
        return false;
    }
}

