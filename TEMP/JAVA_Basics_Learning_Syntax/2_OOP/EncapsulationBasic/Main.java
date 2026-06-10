package EncapsulationBasic;


public class Main {
    static void display(Car obj) {
        System.out.println("---------------");
        System.out.println("Name -> " + obj.GetName());
        System.out.println("Price -> $" + obj.GetPrice());
    }

    public static void main(String[] args) {
        Car car1 = new Car("FORD", 10000);
        display(car1);
        car1.SetPrice(20000);
        car1.SetName("TESLA");
        display(car1);
    }
}