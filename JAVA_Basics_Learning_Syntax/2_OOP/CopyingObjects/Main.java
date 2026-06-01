package CopyingObjects;

public class Main {
    static void display(Car obj) {
        System.out.println("---------------");
        System.out.println("Name -> " + obj.GetName());
        System.out.println("Price -> $" + obj.GetPrice());
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 10000);
        Car car2 = new Car("Ferrari", 20000);
        Car car3 = new Car(car1); //using a copy constructor

        //car2 = car1; // it only points to car1 so both have same memory

        System.out.println("car1 Address -> " + car1);
        System.out.println("car2 Address -> " + car2);
        System.out.println("car3 Address -> " + car3);
        System.out.println("car1 -> " + car1.GetName() + " - $" + car1.GetPrice());
        System.out.println("car2 -> " + car2.GetName() + " - $" + car2.GetPrice());
        System.out.println("car3 -> " + car3.GetName() + " - $" + car3.GetPrice());


        System.out.println("\n----AFTER COPYING CAR OBJECTS----\n");
        car2.CopyObj(car1); //true copy as both still have different memory
        System.out.println("car1 Address -> " + car1);
        System.out.println("car2 Address -> " + car2);
        System.out.println("car3 Address -> " + car3);
        System.out.println("car1 -> " + car1.GetName() + " - $" + car1.GetPrice());
        System.out.println("car2 -> " + car2.GetName() + " - $" + car2.GetPrice());
        System.out.println("car3 -> " + car3.GetName() + " - $" + car3.GetPrice());
        System.out.println();

        display(car1);
        display(car2);
        display(car3);
    }
}