public class SplitCharAndStrings {
    public static void main(String[] args) {
        String str = "Ratan Deep Singh";
        String[] parts = str.trim().split("\\s+");
        // String are stored in this array
        for (String strs : parts)
            System.out.println(strs);
        // !-----------------------------------
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
        // Character are stored in this array
        for (char ch : arr)
            System.out.println(ch);

    }
}
