//overloaded functions or methods = functions that share same name but have different parameters
//method name + parameters  = method signatures
public class func_overloading {
    public static void main(String[] args) {
        System.out.println(display("Bro" , 19));

        System.out.println("\n========OVERLOADED FUNCTIONS===========");
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2.5, 3.7));
        System.out.println(add(2.7, 3.3, 4.9));
        System.out.println(add(2, 3.7, 4));
    }
    static String display(String name ,  int age ){
       return ("you are awesome " + name + "\nand you are just " + age + " years old");
    }
    static int add(int a, int b) {
        System.out.print("TwoIntegerSum : ");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.print("ThreeIntegerSum : ");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.print("TwoDoubleSum : ");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.print("ThreeDoubleSum : ");
        return a + b + c;
    }

}
