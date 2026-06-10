package Interface;

interface Polygon {
    void getArea(int l, int b);
}

// implement the Polygon interface
class Rectangle implements Polygon {
    // implementation of abstract method
    public void getArea(int l, int b) {
        System.out.println("The area of the rectangle is " + (l * b));
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(5, 6);
    }
}