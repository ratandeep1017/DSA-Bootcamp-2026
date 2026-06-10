package DiceRoll;

import java.util.Random;

public class Dice {
    int number;

    Dice(String Player) {
        Random random = new Random();
        number = random.nextInt(6) + 1;
        System.out.println(Player + " Got : " + number);
    }
}
