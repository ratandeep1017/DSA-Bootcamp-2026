
import java.util.ArrayList;

public class clearVSremoveAll_in_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("papaya");
        list.add("grapes");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Mango");

        list.removeAll(list2);
        System.out.println(list); // [Apple]

        list.clear();
        System.out.println(list); // []

    }
}
