package This_Keyword;
class Square {
    int x , y;
    Square(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        square(this);   // call the square() method passing this as argument

        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
    void square(Square obj){
        //Since this keyword contains the reference to the
        // object obj of the class, we can change the value of
        // x and y inside the square() method.
        obj.x *= x;
        obj.y *= y;
    }
}
public class ThisOperator3 {
    public static void main(String[] args) {
        System.out.println("Square The Numbers : '4' and '5'");
        Square obj = new Square(4, 5);
        System.out.println(obj.x + " " +obj.y); //[16 25]

    }
}
