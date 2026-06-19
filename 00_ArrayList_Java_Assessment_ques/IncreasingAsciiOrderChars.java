import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class IncreasingAsciiOrderChars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Character> chars = new ArrayList<>();
        for(int i=0; i<n; i++) {
            char ch = sc.next().charAt(0);
            chars.add(ch);
        }
        Collections.sort(chars);
        chars.forEach(item->System.out.println(item +"(" + (int)item +")"));
    }
}