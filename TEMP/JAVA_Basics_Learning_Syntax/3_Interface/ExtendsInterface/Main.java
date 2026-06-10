package ExtendsInterface;

interface HELLO {
    // members of Line interface
    void hello();
}

// extending interface
interface HEY extends HELLO {
    void hey();
    // members of HELLO interface
    // members of HEY interface
}

class HIE implements HEY {
    @Override
    public void hello() {
        System.out.println("HELLO");
    }

    @Override
    public void hey() {
        System.out.println("HEY");
    }

    public void hie() {
        System.out.println("HIE");
    }
}

public class Main {
    public static void main(String[] args) {
        HIE msg = new HIE();
        msg.hello();
        msg.hey();
        msg.hie();

    }
}
