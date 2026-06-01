package PassingObjcts;

import java.util.ArrayList;

public class Garage {


   private final ArrayList<String> Cars = new ArrayList<>();
     public int counter = 0;
    public void Park(Car car) {
        System.out.println("The Car \"" + car.get_name() + "\", Number Plate \"" + car.get_number() + "\" Is Parked");
        counter++;
        Cars.add(car.get_name());
        TotalCarsInGarage();
    }

    public void Moved(Car car) {
        System.out.println("The Car \"" + car.get_name() + "\" Is Moved From the Garage");
        counter--;
        Cars.remove(car.get_name());
        TotalCarsInGarage();
    }

    void TotalCarsInGarage() {
        System.out.print("Total Cars in Garage : " + counter + "  ");
        System.out.print("\t" + Cars);
        System.out.println("\n---------------------------------------------------------------");
    }

}