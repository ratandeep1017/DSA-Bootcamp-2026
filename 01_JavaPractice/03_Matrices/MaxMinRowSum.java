public class MaxMinRowSum {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 9, 6 },
                { 4, 5, 6, 3, 5 },
                { 7, 8, 9, 7, 3 },
                { 10, 11, 12, 11, 44 },
                { 13, 14, 15, 6, 7 },

        };

        int r = 5, c = 5;
        int sum = 0;
        int max = Integer.MIN_VALUE, maxRowIndex = -1;
        int min = Integer.MAX_VALUE, minRowIndex = -1;

        for (int i = 0; i < r; i++) {
            sum = 0;
            for (int j = 0; j < c; j++)
                sum += arr[i][j];
            if (sum > max) {
                max = sum;
                maxRowIndex = i;
            }
            if (sum < min) {
                min = sum;
                minRowIndex = i;
            }
        }

        System.out.println("Max row sum = " + max + " ,Row Number : " + (maxRowIndex + 1));
        System.out.println("Min row sum = " + min+ " ,Row Number : " + (minRowIndex + 1));

        for (int i = 0; i < r; i++) {
            if (i == maxRowIndex || i == minRowIndex)
                continue;
            for (int j = 0; j < c; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}