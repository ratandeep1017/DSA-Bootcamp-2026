package Constructor;
public class Main {
    public static void main(String[] args) {
        Player P1 = new Player();
        Player P2 = new Player("Hero", 100);

        System.out.println("player name : " + P1.get_name());
        System.out.println(P1.get_name() + "'s Health is : " + P1.health);
        P1.set_health(20);
        P1.talk("Enemies Ahead");
        P1.is_dead();
        System.out.println();
        System.out.println("player name : " + P2.get_name());
        System.out.println(P2.get_name() + "'s Health is : " + P2.health);
        P2.set_health(0);
        P2.talk("Revive ME !");
        P2.is_dead();
    }
}
