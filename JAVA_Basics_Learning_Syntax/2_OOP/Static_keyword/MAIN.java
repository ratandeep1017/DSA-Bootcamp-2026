package Static_keyword;

public class MAIN {
    public static void main(String[] args) {

        //Math MathObj = new Math();
        //we don't create math class's object to access its methods
        //we directly use math class with different methods
        //because those methods are static
        System.out.println("Math.round(345.78) => " + Math.round(345.78));

        System.out.println("=========================================");

        ClassName obj1 = new ClassName();
        ClassName obj2 = new ClassName();
        ClassName obj3 = new ClassName();

        System.out.println("count1 is not (static) so each of the objects \nhave their own copy of count1(variable)");
        System.out.println("obj1.count1 : " + obj1.count1);
        System.out.println("obj2.count1 : " + obj2.count1);
        System.out.println("obj3.count1 : " + obj3.count1);
        //Non-static field 'count1' cannot be referenced from a static context so
        System.out.println("ClassName.count1 : gives us error"); // [ ERROR ]

        System.out.println("=========================================");

        //Static member 'Static_keyword.ClassName.count2' accessed via
        //instance reference which is not a valid method
        System.out.println("count2 and display() is (static)");
        System.out.println("\tINVALID METHODS");
        System.out.println("obj1.count2 : " + obj1.count2);
        System.out.println("obj2.count2 : " + obj2.count2);
        System.out.println("obj3.count2 : " + obj3.count2);
        System.out.print("obj1.display() -> ");
        obj1.display();
        System.out.print("obj2.display() -> ");
        obj2.display();
        System.out.print("obj3.display() -> ");
        obj3.display();

        System.out.println("=========================================");

        System.out.println("\tVALID METHOD");
        System.out.println("count2 and display() is (static) so,");
        System.out.println("ClassName.count2 => " + ClassName.count2);
        System.out.print("ClassName.display() -> ");
        ClassName.display();

    }
}
