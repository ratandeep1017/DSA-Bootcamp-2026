package SuperKeyword.SuperKeyword_constructor2;
//display using toString method

//Super Class
class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("--------------------\nNAME -> " + this.name + "\nAGE -> " + age);
    }
}

//Sub Class
class Hero extends Person {
    private final String power;

    Hero(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return (super.toString() + "\nPOWER -> " + this.power);
    }

}

public class Main2 {
    public static void main(String[] args) {
        Hero h11 = new Hero("Iron-Man", 45, "Money");
        Hero h22 = new Hero("Thor", 300, "Thunder");
        System.out.println(h11.toString());
        System.out.println(h22);
    }
}
