package FileWriter;

import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter mywriter = new FileWriter("newFile.txt");
            mywriter.write("Roses Are Red, Sky Is Blue\nAnd I'm here in love with u :)");
            mywriter.append("\nSome Lines By Me."); //to add text in the end
            mywriter.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
