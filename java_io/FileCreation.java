import java.io.*;
/**
 * Program to create a File and Directory
 */
public class FileCreation {
    public static void main(String[] args) {
        File file = new File("java.txt");
        if(file.exists()) {
            System.out.println("File already exists");
        }
        else {
            try {
                System.out.println("Creating a new file");
                file.createNewFile();
            }catch(IOException ie) {
                System.out.println("Oops!");
            }
        }

        File directory = new File("folder");
        if(directory.exists()) {
            System.out.println("Directory already exists");
        }
        else {
            System.out.println("Creating new directory");
            directory.mkdir();
        }
        if(directory.isDirectory()) {
            System.out.println("This is a directory");
        }

    }
}