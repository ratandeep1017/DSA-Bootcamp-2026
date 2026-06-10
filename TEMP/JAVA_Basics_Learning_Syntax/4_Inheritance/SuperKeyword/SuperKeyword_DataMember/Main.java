package SuperKeyword.SuperKeyword_DataMember;
//Access Attributes of the parent class
//here 'type' refers to the attribute of the child/derived class Dog.
//'super.type' refers to the attribute of the parent class Animal.
class Animal {
    protected String type = "Animal";

    void display() {
        System.out.println("I am of type : " + type);
    }
}

class Dog extends Animal {
     String type = "Dog";

    void display() {
        System.out.println("I am of type -> " + type);
    }

    void call() {
        display();
        super.display();
    }

    public void printType() {
        System.out.println("I am a " + type);
        System.out.println("I am an " + super.type);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.printType();
        dog1.call();
    }
}
