public class ReverseWordsOfAString {
    public String reverseWords(String s) {
        // Remove spaces and split by multiple spaces
        String[] parts = s.trim().split("\\s+");

        // Reverse the array
        int left = 0, right = parts.length - 1;
        while (left < right) {
            String temp = parts[left];
            parts[left] = parts[right];
            parts[right] = temp;
            left++; right--;
        }
        
        return String.join(" ", parts);
    }
}