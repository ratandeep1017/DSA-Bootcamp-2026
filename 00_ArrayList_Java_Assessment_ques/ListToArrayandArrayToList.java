import java.util.ArrayList;
import java.util.Arrays;

public class ListToArrayandArrayToList {
    public static void main(String[] args) {
        //!Array
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(arr.getClass().getSimpleName() + " --> " + Arrays.toString(arr));
        // for(int ele: arr) System.out.print(ele);

        //!Array to arraylist
        ArrayList<Integer> list = new ArrayList<>(); 
        for(int ele : arr) list.add(ele);
        System.out.println(list.getClass().getSimpleName() + " --> " + list);

        //!ArrayList to new array
        int[] arrNew = new int[list.size()];
        for(int i=0; i<list.size(); i++) arrNew[i] = list.get(i);
        System.out.println(arrNew.getClass().getSimpleName() + " --> " + Arrays.toString(arrNew));
    }
}
