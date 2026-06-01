package MethodOverriding;
//OVERRIDING METHOD = DERIVED/CHILD OR SUB CLASS METHOD
//OVERRIDDEN METHOD = PARENT OR SUPER CLASS METHOD
//object of the subclass can access the method of the superclass.
//if the same method is present in both the superclass and subclass then ,
//the method in the subclass overrides the method in the superclass.
class Animal {
    //superclass
    public void eat() {
        System.out.println("I can eat Animal food");
    }

    public void run() {
        System.out.println("I am animal,so I can run");
    }
}

class Dog extends Animal {
    //subclass
    @Override
    public void eat() {
        System.out.println("I eat only dog food");
    }

    public void bark() {
        System.out.println("I can only bark");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        animal.eat();
        dog.eat(); //Dog Class Method is called

        dog.run(); //Animal class method
        dog.bark(); //Dog Class Method
    }
}
