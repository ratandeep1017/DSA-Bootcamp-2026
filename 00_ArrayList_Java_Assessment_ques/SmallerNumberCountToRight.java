// input   = 5 3 6 2
// output  = 2 1 1 0
// 3<5 and 2<5  = 2
// 3<2          = 1
// 6<2          = 1
// 2<nothing    = 0
import java.util.Scanner;
import java.util.ArrayList;
public class SmallerNumberCountToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> vals = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < n; i++)
            vals.add(sc.nextInt());
        int count;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = i + 1; j < n; j++)
                if (vals.get(i) > vals.get(j)) count++;
            counts.add(count);
        }
        counts.forEach(item -> System.out.print(item + " "));
    }
}
