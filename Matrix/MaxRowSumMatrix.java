import java.util.Scanner;

public class MaxRowSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int maxRow = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                maxRow = i;
            }
        }

        System.out.println("Max row sum: " + max);
        System.out.println("Removed Row number: " + (maxRow + 1));

        for (int i = 0; i < r; i++) {
            if (i == maxRow) continue;
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}