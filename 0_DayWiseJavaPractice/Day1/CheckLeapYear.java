 public class CheckLeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));   // true
        System.out.println(isLeapYear(2023));   // false
    }
} 
    

