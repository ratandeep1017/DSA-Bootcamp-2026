// You are using Java
import java.util.ArrayList;
import java.util.Scanner;

class ReplaceValueAtIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> prices = new ArrayList<>();
        
        for(int i=0; i<n; i++) prices.add(sc.nextInt());
        
        int idx = sc.nextInt();
        int price = sc.nextInt();
        prices.set(idx,price);
        
        for(int i=0; i<n; i++) System.out.print(prices.get(i));
        
        
    }
}