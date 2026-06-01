package MultipleInterface;
public class Hawk implements Predator {
    @Override
    public void hunt() {
        System.out.println("*The hawk is hunting*");
    }
    @Override
    public void kills() {
        System.out.println("*The hawk is killing*");
    }
}