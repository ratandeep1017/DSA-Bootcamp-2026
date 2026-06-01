package SimpleInheritance2;

// derived or Child class
class Dog extends Animal {

    public void setType(String type) {
        this.type = type;
    }

    void bark() {
        System.out.println("I can bark! Woof woof!!");
    }

    void displayInfo() {
        System.out.println("I am a " + age);
        System.out.println("My color is " + getColor());
        System.out.println("I am of Type " + type);
    }
}
