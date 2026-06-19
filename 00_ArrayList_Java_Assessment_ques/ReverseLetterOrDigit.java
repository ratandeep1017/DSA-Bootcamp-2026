import java.util.ArrayList;

public class ReverseLetterOrDigit{
    public static void main(String[] args) {
        String str = "a42b*c**^@!32d$edg#132";
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for(int i=0; i<str.length(); i++) arr.add(str.charAt(i));
        
        for(int i=str.length()-1; i>=0; i--){
            char ch = arr.get(i);
            if(Character.isLetterOrDigit(ch)) 
                arr2.add(ch);
        }
        for(int i=0; i<arr.size(); i++){
            char ch = arr.get(i);
            if(!Character.isLetterOrDigit(ch)) 
                arr2.add(i,ch);
        }
        arr2.forEach(item->System.out.print(item));
        
        //O(n^2)
        ////Character ArrayList to String 
        StringBuilder sb = new StringBuilder();
        for (char ch : arr2) sb.append(ch);
        String result = sb.toString();
        System.out.println(result);

        ////O(n) - using normal array 
        // char[] arr = str.toCharArray();
        // int left = 0, right = arr.length-1;
        // while (left < right) {
        //     while (left < right && !Character.isLetterOrDigit(arr[left]))  left++;
        //     while (left < right && !Character.isLetterOrDigit(arr[right])) right--;
        //     swap
        //     char temp = arr[left];
        //     arr[left++] = arr[right];
        //     arr[right--] = temp;
        // }
        // System.out.println(new String(arr));
    }
}