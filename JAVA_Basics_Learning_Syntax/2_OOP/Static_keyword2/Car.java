package Static_keyword2;
public class Car {
    String make; // instance variable
    static int count; // class variable

    public void startEngine(String message) { // method with a parameter
        String sound = "Vroom!"; // local variable
        System.out.println(message + " " + make + " started. " + sound);
        count++; // accessing a class variable
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Honda"; // accessing an instance variable
        car1.startEngine("Car 1"); // calling method with a parameter

        Car car2 = new Car();
        car2.make = "Toyota"; // accessing an instance variable
        car2.startEngine("Car 2"); // calling method with a parameter

        System.out.println("Total cars: " + count); // accessing a class variable
    }
}
