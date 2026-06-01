package SimpleInheritance;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("FORD CAR");  //OR -> car.name = "NewCar";
        Vehicle vehicle = new Vehicle();
        vehicle.name = "Some-Vehicle";
        System.out.println("------SubClass's Data and Methods-------");
        System.out.println("car.doors : " + car.doors); //4
        System.out.println("vehicle.name : " + vehicle.name);
        car.Honks();
        vehicle.move();
        vehicle.stop();

        System.out.println("\n-----Parent Class Methods-----");
        car.move();
        car.stop();
    }
}
