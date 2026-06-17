import java.util.ArrayList;

public class ReverseLetterOrDigit{
    public static void main(String[] args) {
        String str = "a42b*c**^@!32d$edg#132";
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr.add(ch);
        }
        for(int i=str.length()-1; i>=0; i--){
            char ch = arr.get(i);
            if(Character.isLetterOrDigit(ch)) arr2.add(ch);
        }
        for(int i=0; i<arr.size(); i++){
            char ch = arr.get(i);
            if(!Character.isLetterOrDigit(ch)) arr2.add(i,ch);
        }
        
        arr2.forEach(item->System.out.print(item));

    }
}