package This_Keyword;
// Invoking one constructor from another constructor
// is called explicit constructor invocation.

class Complex {
    private int a, b;
    Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }
    Complex(int i) { this(i, i); }
    //to call the constructor Complex(int i, int j)
    // from the constructor Complex(int i)
    //Complex(i , i); gives us [ERROR]
    Complex() { this(0); }
    //to call the constructor Complex(int i)
    // from the constructor Complex()
    //Complex(i); gives us [ERROR]
    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
    }
}
public class ThisOperator2 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(3);
        Complex c3 = new Complex();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
