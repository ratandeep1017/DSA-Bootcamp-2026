import java.util.Arrays;
public class StringCompression {
    public static void main(String[] args) {
        String str = "bbbaaaccdd";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);

        // Compress
        String result = "";
        int count = 1;
        for (int i = 1; i < sorted.length(); i++) {
            if (sorted.charAt(i) == sorted.charAt(i - 1)) count++;
            else {
                result += sorted.charAt(i - 1) + String.valueOf(count);
                count = 1;
            }
        }

        // Last character group
        result += sorted.charAt(sorted.length() - 1) + String.valueOf(count);
        System.out.println("Sorted: " + sorted);
        System.out.println("Compressed: " + result);
    }
}