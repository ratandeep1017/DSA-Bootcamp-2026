package FileReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader myreader = new FileReader("Message.txt");
            int mydata = myreader.read();
            while (mydata != -1) {
                System.out.print((char) mydata);
                mydata = myreader.read();
            }
            myreader.close();
//============================================================================
            System.out.println();
            FileReader myreader2 = new FileReader("newFile.txt");
            int mydata2 = myreader2.read();
            while (mydata2 != -1) {
                System.out.print((char) mydata2);
                mydata2 = myreader2.read();
            }
            myreader2.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
