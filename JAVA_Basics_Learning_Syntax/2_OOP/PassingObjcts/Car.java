package PassingObjcts;

public class Car {
    private String name;
    private int number;

    Car(String name, int number) {
        this.name = name;
        this.number = number;
    }

    String get_name() {
        return name;
    }

    int get_number() {
        return number;
    }
}
