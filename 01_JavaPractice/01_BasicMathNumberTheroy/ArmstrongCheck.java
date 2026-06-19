// An Armstrong number (also called a narcissistic number) is a number where the sum of each digit raised to the power of the total number of digits equals the original number.
// 	- 153 is Armstrong: ( 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 )
// 	- 370 is Armstrong: ( 3^3 + 7^3 + 0^3 = 27 + 343 + 0 = 370 )
// 	- 371 is Armstrong: ( 3^3 + 7^3 + 1^3 = 27 + 343 + 1 = 371 )
// 	- 123 is NOT Armstrong: ( 1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36 )

import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        
        // Count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        if (sum == original) System.out.println(original + " is an Armstrong number.");
        else System.out.println(original + " is NOT an Armstrong number.");
        sc.close();
    }
}