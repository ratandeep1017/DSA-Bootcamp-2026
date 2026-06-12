import java.util.*;

public class SplitStringIntoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        //! Split string into array
        String[] part = str.trim().split("\\s+");

        // Convert array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(part));
        System.out.println(list);
        for (String item : list) System.out.print(item + " ");
        
    }
}