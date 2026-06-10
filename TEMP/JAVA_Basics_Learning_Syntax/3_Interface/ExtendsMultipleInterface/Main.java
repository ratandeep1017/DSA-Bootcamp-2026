package ExtendsMultipleInterface;

interface A {
    void a();
}
interface B {
    void b();
}
// extending multiple interface
interface C extends A, B {
    void c();
}
class OWN implements C {
    public void own() {
        System.out.println("own");
    }
    @Override
    public void a() {
        System.out.println("A");
    }
    @Override
    public void b() {
        System.out.println("B");
    }
    @Override
    public void c() {
        System.out.println("C");
    }
}
public class Main {
    public static void main(String[] args) {
        OWN msg = new OWN();
        msg.a();
        msg.b();
        msg.c();
        msg.own();
    }
}