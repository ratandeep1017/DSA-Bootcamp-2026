package AudioFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scan = new Scanner(System.in);
        File file = new File("AudioFile.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);


        String input = "";
        while (!input.equals("Q")) {
            System.out.println("P = Play\nS = Stop\nR = Reset\nQ = Quit");
            System.out.println("Enter your choice");
            input = scan.next();
            input = input.toUpperCase();
            switch (input) {
                case ("P"):
                    clip.start();
                    break;
                case ("S"):
                    clip.stop();
                    break;
                case ("R"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not A Valid Input");
                    break;
            }
        }

        System.out.println("\nByyyyyeeeeee");
    }
}
