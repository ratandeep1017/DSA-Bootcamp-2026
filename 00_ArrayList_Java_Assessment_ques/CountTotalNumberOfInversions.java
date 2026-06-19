import java.util.ArrayList;
import java.util.Scanner;

public class CountTotalNumberOfInversions {
       public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> vals = new ArrayList<>();
        for(int i=0; i<n; i++) vals.add(sc.nextInt());
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++)
                //THIS CONDITION IS GIVIN IN THE QUESTION THAT 
                //(left number > right number) and (left index < right index)
                if(vals.get(i) > vals.get(j) && i<j)
                count++;
        }
        System.out.print(count);
        sc.close();
    }
}
