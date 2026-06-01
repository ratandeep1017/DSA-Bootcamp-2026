package SimpleInheritance;

// car inherits all the properties of Vehicle class
class Car extends Vehicle {
    //Data Member
    public int doors = 4;

    //Constructor
    Car(String name) {
        this.name = name;       //this.name = name
    }

    //Some Method
    void Honks() {
        System.out.println(name + " Honk-Honk");
    }
}
