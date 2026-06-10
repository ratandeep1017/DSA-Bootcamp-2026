package DefaultWithInrterface;

//we can now add methods with implementation inside an interface.
// These methods are called default methods.
interface Polygon {
    void getArea();
    // default method
    default void getSides() {
        System.out.println("I get sides of polygon.");
    }
}
// implements the interface
class Rectangle implements Polygon {
    //Abstract Method
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("The area of the rectangle is " + area);
    }
    //Default Method - overrides the getSides()
    @Override
    public void getSides() {    //overridden method
        System.out.println("I have 4 sides.");
    }
}
class Square implements Polygon {
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }
}

class Main {
    public static void main(String[] args) {

        // create an object of Rectangle
        Rectangle r1 = new Rectangle();
        r1.getArea();
        r1.getSides();

        // create an object of Square
        Square s1 = new Square();
        s1.getArea();
        s1.getSides();
    }
}
/* while calling the `getSides()` method using the Rectangle object,
the overridden method is called. However, in the case of the Square object,
the default method is called.*/
