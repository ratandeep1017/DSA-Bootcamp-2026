//=====WHAT WE LEARN IN THIS CODE=====

// only difference between  print and println is new line at the end.
// for string use  => String name = scan.nextLine();
// for other data-types use => int age = scan.nextInt();  or double age = scan.nextDouble();
// use => scan.nextLine();  in between inputs of a numerical data-type and a string data-type
//while loop and do while loop
//While working with loops, sometimes we might want to skip some statements or terminate the loop.
// In such cases, break and continue statements are used.
//checking validity of inputted data

import java.util.Scanner;

public class InputStream {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Name ? ");
        String name = scan.nextLine();

        System.out.print("Age ? ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.print("Fav food ? ");
        String food = scan.nextLine();

        System.out.println("NAME = " + name + "\nAge = " + age + "\nFav Food =  " + food);

        System.out.println("======================================================================================================================");

        //program to find hypotenuse of a triangle
        double x, y;
        System.out.print("enter side x , and y : ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        scan.nextLine();
        System.out.println("Hypotenuse is : " + Math.sqrt((x * x) + (y * y)));

        System.out.println("======================================================================================================================");

        System.out.print("enter a number for finding factorial : ");
        long factorial = 1;
        int num = scan.nextInt();
        while (num != 1) {
            factorial *= num;
            num--;
        }
        System.out.println("factorial = " + factorial);

        System.out.println("======================================================================================================================");
        System.out.println("sum until negative or a zero number is entered");
        int sum = 0, number = 0;
        do {
            sum += number;
            System.out.print("Enter a number : ");
            number = scan.nextInt();
        } while (number > 0);
        System.out.println("Sum = " + sum);

        System.out.println("======================================================================================================================");

        System.out.print("Enter a correct day name : ");
        String day = scan.next();
        switch (day) {
            case "sunday":
                System.out.println("Its Sunday");
                break;
            case "monday":
                System.out.println("Its Monday");
                break;
            case "tuesday":
                System.out.println("Its Tuesday");
                break;
            case "wednesday":
                System.out.println("Its Wednesday");
                break;
            case "thursday":
                System.out.println("Its Thursday");
                break;
            case "friday":
                System.out.println("Its Friday");
                break;
            case "saturday":
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("invalid day name");
        }

        System.out.println("======================================================================================================================");
        System.out.println("sum of 6 positive numbers");
        Double Number, summation = 0.0;
        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter number " + i + " : ");
            Number = scan.nextDouble();
            // if number is negative then sum isn't happen and
            // continue statement is executed
            if (Number < 0.0)
                continue;
            summation += Number;
        }
        System.out.println("Sum = " + summation);

        System.out.println("======================================================================================================================");

        System.out.println("CheckForInt : ");
        System.out.println(scan.hasNextInt());
     //    scan.nextLine();
     //    System.out.println("CheckForString : ");
     //    System.out.println(scan.hasNextLine());

        scan.close();
    }

}

