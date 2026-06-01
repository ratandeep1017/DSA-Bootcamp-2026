package AbstractKeyword;

//A Generic Parent Abstract Class
abstract class Bike {

    abstract void brake(); // an abstract method

     String name;

    Bike(String name) {
        this.name = name;
    }

    Bike() {
        this.name = "Generic-Bike";
    }
}

//Subclasses
class SportsBike extends Bike {
    // implementation of abstract method
    @Override
    public void brake() {
        System.out.println(name + " SportsBike.Brake");
    }

    SportsBike(String name) {
        super(name);
    }

    SportsBike() {
        super();
    }
}

class MountainBike extends Bike {
    // implementation of abstract method
    @Override
    public void brake() {
        System.out.println(name + " MountainBike.Brake");
    }

    MountainBike() {
        super();
    }

    MountainBike(String name) {
        super(name);
    }
}

class Main {
    public static void main(String[] args) {
        //Bike b1 = new Bike(); [ERROR]
        MountainBike m1 = new MountainBike();
        SportsBike s1 = new SportsBike();
        System.out.println(m1.name);
        System.out.println(s1.name);
        m1.brake();
        s1.brake();

        System.out.println();

        MountainBike m2 = new MountainBike("MOUNTAIN-B");
        SportsBike s2 = new SportsBike("SPORTS-B");
        System.out.println(m2.name);
        System.out.println(s2.name);
        m2.brake();
        s2.brake();

    }
}
