import java.util.Scanner;

public class NegateEvenRowsAndRevCol {
    //// A Swap Funtion in java Looks like this  
    // public void swap(int[][] m, int r1, int c1, int r2, int c2) {
    //     int temp = m[r1][c1];
    //     m[r1][c1] = m[r2][c2];
    //     m[r2][c2] = temp;
    // }
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int r = 3, c = 3;

        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) 
                for (int j = 0; j < c; j++) m[i][j] = -m[i][j];
        }

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r / 2; i++) {
                //SWAP
                int temp = m[i][j];
                m[i][j] = m[r - i - 1][j];
                m[r - i - 1][j] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) 
                System.out.print("[" + m[i][j] + "]");
            System.out.println();
        }
    }
} 
