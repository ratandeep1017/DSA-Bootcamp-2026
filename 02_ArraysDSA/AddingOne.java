//1879 + 1 = 1880 (dont implement on numbers but on array values)
public class AddingOne {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 9, 3 };
        int n = arr.length - 1;
        if (arr[n] != 9) arr[n]++;
        else {
            arr[n] = 0;
            arr[n - 1]++;
        }
        for (int e : arr) System.out.print(e + " ");
    }
}
3499