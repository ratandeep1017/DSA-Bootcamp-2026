package CharacterStringDSA;
public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "aabccd";
        int[] count = new int[256];  // ASCII size
    
        // Count frequency using ASCII as index
        for (char c : str.toCharArray()) count[c]++;
        
        // Find max
        int max = 0;
        char result = str.charAt(0);
        for (int i=0; i < str.length(); i++) 
            if (count[str.charAt(i)] > max) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }        
        System.out.println("Most frequent: " + result + " (" + max + " times)");
    }
}