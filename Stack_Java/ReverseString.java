import java.util.Stack;

public class Main {
    public static void reverseWords(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') stack.push(ch);
             else { 
                while (!stack.isEmpty()) System.out.print(stack.pop());
                System.out.print(" ");
            }
        }
       while (!stack.isEmpty())System.out.print(stack.pop());
    }

    public static void main(String[] args) {
        reverseWords("Hello World");
    }
}