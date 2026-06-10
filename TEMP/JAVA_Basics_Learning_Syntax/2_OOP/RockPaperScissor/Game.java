package RockPaperScissor;

import java.util.Random;

 class Game {
    String name , option ;
    int number ;

    Game(String Player) {
        Random random = new Random();
        number = random.nextInt(3) + 1;
        if(number == 1 )
            option = "Rock";
        else if(number == 2)
            option = "Paper";
        else
            option = "Scissor";
        System.out.println(Player + " Got : " + option);
    }
}
