package SuperKeyword.SuperKeyword_constructor1;
//SUPER REFERS TO PARENT CLASS

//However, using `super()` is not compulsory. Even if `super()`
// is not used in the child/derived class constructor, the compiler
// implicitly calls the default constructor of the parent class.
//-----------------------------------------------------------------
//super(args) is required if the parameterized constructor of the parent
// class has to be called from the child/derived class constructor.
class Animal {
    Animal() {
        System.out.println("I am an animal");
    }

    Animal(String name) {
        System.out.println("I am an animal with name : " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super();// calling default constructor of the parent class
        System.out.println("I am a dog");
    }

    Dog(String name) {
        super("Lion");// calling parameterized constructor of the parent class
        System.out.println("I am an Dog with name : " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println();

        Dog dog2 = new Dog("Sheero");
        System.out.println();

//        Animal animal1 = new Animal();
//        Animal animal2 = new Animal("Tiger");
    }
}
