package CopyingObjects;


class Car {
    private String name;
    private int price;

    Car(String name, int price) {
        this.SetName(name);
        this.SetPrice(price);
    }

    String GetName() {
        return name;
    }

    int GetPrice() {
        return price;
    }

    void SetName(String name) {
        this.name = name;
    }

    void SetPrice(int price) {
        this.price = price;
    }

    void CopyObj(Car car) { //copying object function
        //if car2.copy(car1); then "this" refers to car2
        this.SetName(car.GetName());
        this.SetPrice(car.GetPrice());
    }

    Car(Car car) {  //copy constructor
        this.CopyObj(car);
    }
}
