package Polymorphism;

import java.sql.SQLOutput;

class Polygon {  // method to create a shape
    public void create() {
       // System.out.println("Rendering Polygon...");
    }
}

class Line extends Polygon {  // create Square
    public void create() {
        super.create();
        System.out.println("Creating Line...");
    }
}

class Square extends Polygon {  // create Square
    public void create() {
        super.create();
        System.out.println("Creating Square...");
    }
}

class Circle extends Polygon {  // create circle

    public void create() {
        super.create();
        System.out.println("Creating Circle...");
    }
}

class Main {
    public static void main(String[] args) {
        Square s1 = new Square();
        Line l1 = new Line();
        Circle c1 = new Circle();
        Polygon[] shapes = {s1, c1, l1};
        for (Polygon loop : shapes)
            loop.create();



    }
}
