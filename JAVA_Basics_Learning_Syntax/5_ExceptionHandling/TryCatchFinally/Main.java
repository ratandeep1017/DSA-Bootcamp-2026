package TryCatchFinally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter Two Numbers : ");
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println("Result : " + x / y);
            System.out.println("This Line Is not Gonna Print : < Only if error comes before this line >");
        } catch (ArithmeticException e) {
            System.out.println("You Can't Divide A Number By Zero : " + e.getMessage()); // (/ by zero)
        } catch (InputMismatchException e) {
            System.out.println("Please enter a Integral Number" + e.getMessage()); // (null)
        } catch (Exception e) {
            System.out.println("Something Went Wrong" + e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
            scan.close();
        }
    }
}
