package CreateWriteReadDelete;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

//createNewFile() -> java.io.File
//write() ->java.io.FileWriter
//read() ->java.io.FileReader
//delete() -> java.io.File


public class Main {
    public static void main(String[] args) {
        File file = new File("MyPersonalFile.txt");
        File MyFolder = new File("C:\\Users\\ratan\\IdeaProjects\\FileHandling");
        System.out.println("File list = " + Arrays.toString(MyFolder.list()));
        try {
            boolean value = file.createNewFile();
            if (value)
                System.out.println("The new file is created");
            else
                System.out.println("The new file already exist so need to create it again");

            System.out.println("=========================================================================");
            if (file.exists()) {
                System.out.println("File Exists");
                System.out.println("Path = " + file.getPath());
                System.out.println("File Name = " + file.getName());
                System.out.println("File size = " + file.length());
                System.out.println("File Readable = " + file.canRead());
                System.out.println("File Writeable = " + file.canWrite());
                System.out.println("Absolute Path = " + file.getAbsolutePath());
                System.out.println("FileCheck = " + file.isFile());//for folders it returns false
            } else
                System.out.println("File Doesn't Exist");

            System.out.println("=========================================================================");
            System.out.println("Data Is Written On The File. . . . . . . . . .");
            String randomdata = "Hello World!\n";
            FileWriter mywriter = new FileWriter(file);
            mywriter.write("\nRoses Are Red, Sky Is Blue\nAnd I'm here in love with u :)");
            mywriter.append("\nSome Lines By Me\n"); //to add text in the end
            mywriter.write(randomdata);
            mywriter.close();

            System.out.println("=========================================================================");
            System.out.println("Way 1 of Reading data From The File. . . . . . . . . ");
            FileReader myreader = new FileReader(file);
            int mydata = myreader.read();
            while (mydata != -1) {
                System.out.print((char) mydata);
                mydata = myreader.read();
            }
            myreader.close();

            System.out.println("=========================================================================");
            System.out.println("Way 2 of Reading data From The File. . . . . . . . . ");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

            System.out.println("=========================================================================");
            //file.delete();
            boolean check = file.exists();
            if (check)
                System.out.println("The File is not deleted.");
            else
                System.out.println("The File is deleted.");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
