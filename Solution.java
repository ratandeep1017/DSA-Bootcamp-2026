public class Solution {
    public static int lengthOfLastWord(String s) {
        String[] parts = s.trim().split("\\s+");
        // String[] parts = s.split(" ");
        for(String e : parts) System.out.print(e + "-");

        int n = parts.length-1;

        return parts[n].length();

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
}