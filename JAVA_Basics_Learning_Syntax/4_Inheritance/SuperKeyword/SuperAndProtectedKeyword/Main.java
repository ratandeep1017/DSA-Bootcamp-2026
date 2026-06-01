package SuperKeyword.SuperAndProtectedKeyword;

//we know that the same method in the child/derived
//class overrides the method in parent class.
//so to call the method of the parent class from the
//method of the child class, the `super` keyword is used

class Animal {
    //superclass
    protected String name;
    protected void display() {
        System.out.println("I am an animal.");
    }
    public void eat() {
        System.out.println("I can eat Animal food");
    }
    public void run() {
        System.out.println("I am animal and I can run");
    }
}

class Dog extends Animal {
    //subclass
    public void display() { System.out.println("I am a dog"); }
    public void printMessage() {
        super.display();
        display();

    } // this calls overridden method

    //public void printMessage(){display();} // this calls overriding method
    public void bark() {
        System.out.println("I can only bark");
    }

    public void getInfo() {
        System.out.println("My name is " + name);
    }

    public void eat() {
        super.eat(); // call method of parent class
        System.out.println("I eat only dog food");
        //super.run(); // call method of parent class
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(); //Animal class method
        dog.bark(); //Dog Class Method

        System.out.println("\nUnderstanding Super Keyword");
        dog.printMessage();
        dog.eat();//Animal Class Method is called 1st
        // then dog class method is called


        System.out.println("\nUnderstanding Protected Keyword");
        // access protected field and method
        // using the object of child/derived class
        dog.name = "CHUCKY";
        dog.display();
        dog.getInfo();
    }
}
