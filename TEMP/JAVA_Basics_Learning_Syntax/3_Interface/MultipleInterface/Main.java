package MultipleInterface;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        //rabbit.hunt(); [ERROR]
        //rabbit.kills(); [ERROR]
        rabbit.flee();

        // hawk.flee(); [ERROR]
        hawk.hunt();
        hawk.kills();

        fish.hunt();
        fish.flee();
        fish.kills();
    }
}