
public class String_functions {
    public static void main(String[] args) {
        String name = "BRO"; //with the help of String literal
        System.out.println(name.equals("bro"));
        System.out.println(name.equalsIgnoreCase("bro"));
        System.out.println(name.isEmpty());
        System.out.println(name.toCharArray());

        System.out.println("===============================================================");

        String name1 = "   RatanDeep Singh   ";
        String blast  = "hi hello hi hello whi whello";
        System.out.println(name1.length());
        System.out.println(name1.charAt(6));
        System.out.println(name1.indexOf("S"));
        System.out.println(name1.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.trim());// remove empty spaces before 1st char and after last char
        System.out.println(name1.replace('e', 'K'));
        System.out.println(blast.replaceAll("hi", "hey"));
        System.out.println(blast.replaceFirst("hi", "hey"));


        System.out.println("==================================");
        //java strings are immutable
        String example = "Hello! ";
        example.concat(" World");// add another string "World" to the previous string
        System.out.println(example); //Hello!


        System.out.println("==================================");
        // For two strings to be equal, their hash code also must be equal.
        String emptystr = ""; //hashcode always zero
        System.out.println(emptystr.hashCode());

        String a = "string";
        String b = new String("string");
        String c = "mystring";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());


        System.out.println("==========================");
        String newstr = "Hello My Friends!";
        System.out.println(newstr.startsWith("Hello"));
        System.out.println(newstr.endsWith("Friends"));
        System.out.println(newstr.contentEquals("Hello My Friends"));
        System.out.println(newstr.contains("ends"));
        System.out.println(newstr.substring(6));
        System.out.println(newstr.substring(9 , 15));

    }
}
