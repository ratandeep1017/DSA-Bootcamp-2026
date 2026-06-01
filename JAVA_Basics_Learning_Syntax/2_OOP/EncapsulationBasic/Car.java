package EncapsulationBasic;

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
}
