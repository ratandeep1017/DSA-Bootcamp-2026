import java.util.Arrays;
import java.util.Scanner;

public class split_strng_into_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String [] part = str.trim().split("\\s+");
        
        //USING Arrays.toString FUNCTION
        System.out.println(Arrays.toString(part));

        for (String str_output : part) {
            System.out.print(str_output + " ");
        }
    }
}
