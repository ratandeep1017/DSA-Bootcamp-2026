package DynamicPolymorphism;
//us when we ask that -> are you a boy or a girl ?

import java.util.Scanner;

class Animal {
    public void speak() {
        System.out.println("animal goes ........");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("cat meows");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("dog barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal;
        Scanner scan = new Scanner(System.in);
        System.out.print("(1 = dog) and (2 = cat) : ");
        int choice = scan.nextInt();
        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("wrong choice");
            animal.speak();
        }

    }
}