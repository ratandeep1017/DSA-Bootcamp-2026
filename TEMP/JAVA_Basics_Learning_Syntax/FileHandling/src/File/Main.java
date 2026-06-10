package File;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //initial directory is our project name
        File file = new File("Message.txt");
        if (file.exists()) {
            System.out.println("File Exists = > " + file.exists());
            System.out.println(file.getPath());
            System.out.println(file.getName());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());//for folders it returns false
            //< This can delete this file >
            //file.delete();
        } else
            System.out.println("File Exist => " + file.exists());

//=============================================================================================
        // create a file object for the current location
        File file2 = new File("newFile.txt");
        try {
            boolean value = file2.createNewFile();
            if (value)
                System.out.println("The new file is created.");
            else
                System.out.println("The new file already exists.");
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
