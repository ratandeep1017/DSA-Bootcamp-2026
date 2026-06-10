//UNDERSTANDING PRINTF STATEMENT WITH FORMAT SPECIFIERS
public class PrintfStatement {
    public static void main(String[] args) {
        int myint = 1;
        boolean mybool = true;
        char mychar = '$';
        String mystring = "Dear";
        double mydouble = 1234.5678;

        // ( % CONVERSION_CHARACTER )
        System.out.printf("Numbers are = %d and %d\n", myint, 2);
        System.out.printf("%b\n", mybool);
        System.out.printf("%c\n", mychar);
        System.out.printf("%s\n", mystring);
        System.out.printf("%f\n", mydouble); //same for float

        //( WIDTH )
        //minimum number of characters written as output
        System.out.printf("Hello %10s Friend\n", mystring);
        System.out.printf("Hello %-10s Friend\n", mystring);

        // ( PRECISION )
        //sets number of digits of precision when outputting floating-point values
        System.out.printf("Money = %.2f%c\n", mydouble,mychar);

        // ( FLAGS )
        //adds an effect to output based on the flag added to format specifier
        System.out.printf("Money = %-20f$\n", mydouble);// - : left justify
        System.out.printf("Money = %20f$\n", mydouble);
        System.out.printf("Money = %020f$\n", mydouble);// 0 : numeric value are zero padded
        System.out.printf("Money = %,f$\n", mydouble);// , : comma grouping separator if numbers > 1000
        System.out.printf("Money = %+,.2f$\n", mydouble); // + : output a (+) and (-) sign for numeric value
        // for (-) change ( mydouble to -12.123456;)


        String grandTotal = String.format("Grand Total: %,.2f$", mydouble);
        System.out.println(grandTotal);
    }
}