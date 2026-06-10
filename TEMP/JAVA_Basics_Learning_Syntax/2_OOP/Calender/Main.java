package Calender;
import java.util.Scanner;
public class Main {
    static String[] monthName = {" ", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY",
            "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
    static int[] DaysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = scanner.nextInt();
        if (LeapYear(year))
            DaysInMonth[2] = 29;
        PrintCal(year);
    }
    static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    static void PrintCal(int year) {
        for (int month = 1; month <= 12; month++) {
            System.out.println("\n\n\t\t" + monthName[month] + " " + year);
            System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
            int dayOfWeek = getday(year, month);
            for (int i = 1; i <= DaysInMonth[month]; i++) {
                if (i == 1) {
                    for (int j = 0; j < dayOfWeek; j++)
                        System.out.print("\t");
                }
                System.out.printf("%2d\t", i);
                if ((i + dayOfWeek) % 7 == 0)
                    System.out.println();
            }
            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        }
    }
    static int getday(int year, int month) {
        // return the day of the week for the first day of the month
        int y = year - (14 - month) / 12;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return ((1 + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7);
    }
}