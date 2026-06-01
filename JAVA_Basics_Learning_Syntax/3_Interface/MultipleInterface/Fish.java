package MultipleInterface;
//Implementing Multiple Interfaces
public class Fish implements Prey, Predator {
    @Override
    public void hunt() {
        System.out.println("*The fish is hunting a smaller fish*");
    }
    @Override
    public void flee() {
        System.out.println("*The fish is fleeing from a larger fish*");
    }
    @Override
    public void kills() {
        System.out.println("*The fish is killing a smaller fish*");
    }
}