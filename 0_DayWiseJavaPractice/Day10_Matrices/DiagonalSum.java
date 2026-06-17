public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {9, 7, 8}
        };

        int n = arr.length;
        int mainSum = 0, secondarySum = 0;

        for (int i = 0; i < n; i++) {
            mainSum += arr[i][i]; //1+5+8
            secondarySum += arr[i][n - 1 - i]; //3+5+6
        }

        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
    }
}