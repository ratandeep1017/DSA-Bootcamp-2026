package SuperKeyword.SuperKeyword_constructor2;
//display method using getters and setters

//Super Class
class Persons {
    private final String name;
    private final int age;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int get_age() {
        return age;
    }

    String get_name() {
        return name;
    }
}

//Sub Class
class Heros extends Persons {
    private final String power;

    Heros(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    String get_power() {
        return power;
    }
}

public class Main1 {
    static void Info(Heros obj) {
        System.out.println("-----------------------");
        System.out.println("NAME = " + obj.get_name());
        System.out.println("AGE = " + obj.get_age());
        System.out.println("POWER = " + obj.get_power());
    }

    public static void main(String[] args) {
        Heros h1 = new Heros("Iron-Man", 45, "Money");
        Heros h2 = new Heros("Thor", 300, "Thunder");
        Info(h1);
        Info(h2);
    }
}
