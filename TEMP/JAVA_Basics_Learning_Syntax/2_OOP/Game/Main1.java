package Game;

//separate class and main function
class Players {
    public
    String name;
    int health = 100;

    void talk(String text) {
        System.out.println(name + " says " + text);
    }

    Boolean is_dead() {
        if (health == 0) {
            System.out.println(name + "'s health is " + health + " So Player is out ");
            return true;
        } else {
            System.out.println(name + "'s health is " + health + " So Player is still in the game ");
            return false;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Players P1 = new Players();
        P1.name = "Bro";
        System.out.println("player name : " + P1.name);
        System.out.println(P1.name + "'s Health is : " + P1.health);

        P1.talk("Enemies Ahead");
        P1.health = 80;
        P1.is_dead();

        P1.talk("Revive me");
        P1.health = 0;
        P1.is_dead();
    }
}
