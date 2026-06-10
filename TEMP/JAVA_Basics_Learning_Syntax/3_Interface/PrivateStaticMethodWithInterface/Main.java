package PrivateStaticMethodWithInterface;

interface Polygon {
    //the rule for calculating the area is different for different polygons.
    // Hence, `getArea()` is included without implementation.
    //Any class that implements Polygon must provide an implementation of `getArea()`.
    void getArea();

    //We can calculate the perimeter of all polygons in the same manner
    //so, we implemented the body of `getPerimeter()` in Polygon Interface.
    default void getPerimeter(int n, int... sides) {
        int perimeter = 0;
        //for (int side : sides) {
        //  perimeter += side;}
        for (int i = 0; i < n; i++) {
            perimeter += sides[i];
        }
        System.out.println("\nPerimeter: " + perimeter);
    }
}

class Triangle implements Polygon {

    private final double a, b, c;
    private double s;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea() {
        s =  (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("Area: %.3f", area);
    }
}

class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 3, 4);
        t1.getArea();                          // calls the method of the Triangle class
        t1.getPerimeter(3, 2, 3, 4);       // calls the method of Polygon
    }
}
