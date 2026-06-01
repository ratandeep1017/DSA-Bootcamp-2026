package SimpleInheritance2;
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        // Create object of the Dog class
        System.out.println("-----Calling members of the Parent class-----");
        dog1.eat();
        dog1.setColor("black");
        System.out.println(dog1.getColor());

        System.out.println("\n-----Calling member of the child class-----");
        dog1.bark();
        dog1.setType("mammal");
        dog1.displayInfo();
    }
}
