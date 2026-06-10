package SimpleInheritance2;

//Parent Class
public class Animal {
    private String color;
    protected String type;
    public int age = 10;

    void eat() {
        System.out.println("I can eat!");
    }

    void setColor(String clr) {
        color = clr;
    }

    String getColor() {
        return color;
    }
};

