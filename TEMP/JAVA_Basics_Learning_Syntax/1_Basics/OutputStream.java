//=====WHAT WE LEARN IN THIS CODE=====

//shortcut for [ System.out.print(); ] : [ sout + tab ]
//simple printing of data and variables
//string swapping
//data types
//pre-post-increment and decrement
//typecasting and divisibility with integer and float numbers
//understanding Math class in java < max , min , abs , ceil , floor , round , sqrt , pow >


public class OutputStream {

    public static void main(String[] args) {
        int num = 100;
        
        System.out.printf("num = %d", num); //c,c++ type printing using printf
        System.out.print("Hello!"); //without new line
        System.out.println("Hello!");   //with a new line
        System.out.println("Hello\tworld!\n"); //with a new line and escape sequence
        System.out.println("\"hello\" \t \"world!\"");    //with double inverted commas

        System.out.println("======================================================================================================================");

        //string swapping
        String name1 = "Hero", name2 = "Bro";
        System.out.println("Name1 : " + name1 + ", Name2 : " + name2);
        String temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println("Name1 : " + name1 + ", Name2 : " + name2);

        System.out.println("======================================================================================================================");

        //data types
        int y = 2, x = 5;
        long z = 1222222222L;
        float k = 3.14f;
        double a = 3.14;
        boolean b = true;
        char symbol = '$';
        System.out.println(x + y);
        System.out.println("x : " + x + ", y : " + y);
        System.out.println("x+y = " + x + y);   //we need to use brackets to sum
        System.out.println("x+y = " + (x + y));
        System.out.println("x-y = " + (x - y));
        System.out.println("x/y = " + (x / y));
        System.out.println("x/y = " + (x / y));
        System.out.println("x*y = " + (x * y));
        System.out.println("x%y = " + (x % y));
        System.out.println(z + " " + k + " " + a + " " + symbol);
        System.out.println(b);

        System.out.println("======================================================================================================================");

        //pre and post increment and decrement
        System.out.println("main value of x is : " + x);
        x = 5;
        System.out.println("++x = " + ++x);
        System.out.println("x = " + x);
        x = 5;
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);
        x = 5;
        System.out.println("--x = " + --x);
        System.out.println("x = " + x);
        x = 5;
        System.out.println("x-- = " + x--);
        System.out.println("x = " + x);

        System.out.println("======================================================================================================================");

        int myint = 12;
        double mydouble = myint;
        System.out.println(myint);
        System.out.println(mydouble);

        double mydouble2 = 12.78d;
        int myint1 = (int)mydouble2;
        System.out.println(myint1);
        System.out.println(mydouble2);

        //typecasting and divisibility with integer and float numbers
        int m = 10, n = 3;
        System.out.println("INT");
        System.out.println("10/3 = " + (m / n));
        System.out.println("(float)10/3 = " + (float) (m / n));

        System.out.println("FLOAT");
        float p = 10, q = 3;
        System.out.println("10/3 = " + (p / q));
        System.out.println("(int)10/3 = " + (int) (p / q));

        System.out.println("======================================================================================================================");

        //understanding math class in java
        // max , min , abs , ceil , floor , round , sqrt , pow
        double X = 3.4, Y = -10, Z = 4, v = 3.5;
        System.out.println(Math.max(X, Y));
        System.out.println(Math.min(X, Y));
        System.out.println(Math.abs(Y));
        System.out.println(Math.round(X));
        System.out.println(Math.round(v));
        System.out.println(Math.ceil(X));
        System.out.println(Math.floor(X));
        System.out.println(Math.sqrt(Z));
        System.out.println(Math.pow(Z, 2));

        System.out.println("======================================================================================================================");

        System.out.println("Understanding Final Keyword in JAVA");
        final double PI = 3.14159;
        // [ ERROR ] --> PI = 2123;
        System.out.println(PI);

        }
    }
