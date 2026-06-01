package PassingObjcts;

public class MAIN {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("BMW", 34);
        Car car2 = new Car("TESLA", 45);
        Car car3 = new Car("SUZUKI", 78);
        Car car4 = new Car("MERCEDES", 90);
        Car car5 = new Car("RANGE-ROVER", 19);

        garage.Park(car1);
        garage.Park(car2);
        garage.Park(car3);
        garage.Park(car4);
        garage.Park(car5);

        garage.Moved(car3);
        garage.Moved(car4);
        System.out.println();




        //garage.TotalCarsInGarage();
        //System.out.println(garage.counter); // gives error when data is private

        //System.out.println(Garage.counter); // to run this we need to make our data STATIC
        // [ public static int counter = 0; ]
    }
}
