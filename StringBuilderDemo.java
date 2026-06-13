public class StringBuilderDemo {
    public static void main(String[] args) {

        // Start with an empty StringBuilder
        StringBuilder sb = new StringBuilder();

        // 1. append(String), append(char), append(int)
        sb.append("Hello");
        sb.append(' ');
        sb.append("World");
        sb.append(' ');
        sb.append(2024);
        StringBuilder str1 = sb;
        System.out.println("After append: " + sb);  // Hello World 2024
        System.out.println("After append: " + str1);  // Hello World 2024

        // 2. insert(int, String)
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);  // Hello Beautiful World 2024

        // 3. delete(int, int)
        sb.delete(6, 16);  // remove "Beautiful "
        System.out.println("After delete range: " + sb);  // Hello World 2024

        // 4. deleteCharAt(int)
        sb.deleteCharAt(5);  // remove space between Hello and World
        System.out.println("After deleteCharAt: " + sb);  // HelloWorld 2024

        // 5. replace(int, int, String)
        sb.replace(5, 10, " Java");
        System.out.println("After replace: " + sb);  // Hello Java 2024

        // 6. length()
        int len = sb.length();
        System.out.println("Length: " + len);

        // 7. charAt(int)
        char firstChar = sb.charAt(0);
        System.out.println("First char: " + firstChar);

        // 8. setCharAt(int, char)
        sb.setCharAt(0, 'h');
        System.out.println("After setCharAt: " + sb);  // hello Java 2024

        // 9. "clear()" behavior using setLength(0)
        sb.setLength(0);  // this clears the content
        System.out.println("After clear (setLength(0)): '" + sb + "'");

        // 10. toString()
        sb.append("StringBuilder demo");
        String result = sb.toString();
        System.out.println("toString result: " + result);

        // 11. substring(int) and substring(int, int)
        String sub1 = sb.substring(1);        // from index 1 to end
        String sub2 = sb.substring(0, 6);     // from 0 to 5
        System.out.println("substring(1): " + sub1);
        System.out.println("substring(0, 6): " + sub2);

        // 12. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
        sb.reverse();  // reverse back to original

        // 13. "contains(String)" behavior using indexOf
        String search = "demo";
        boolean contains = sb.indexOf(search) >= 0;
        System.out.println("Contains '" + search + "': " + contains);

        // 14. indexOf(String) and indexOf(String, int)
        int idx1 = sb.indexOf("i");
        int idx2 = sb.indexOf("i", idx1 + 1);
        System.out.println("indexOf(\"i\"): " + idx1);
        System.out.println("indexOf(\"i\", " + (idx1 + 1) + "): " + idx2);

        // 15. lastIndexOf(String)
        int lastIdx = sb.lastIndexOf("e");
        System.out.println("lastIndexOf(\"e\"): " + lastIdx);

        // 16. "isEmpty()" behavior using length()
        boolean isEmpty = sb.length() == 0;
        System.out.println("Is empty: " + isEmpty);

        // 17. capacity() and ensureCapacity(int)
        System.out.println("Initial capacity: " + sb.capacity());
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());
    }
}