import java.io.*;
/**
 * Program to create a File and Directory
 */
public class FileInStream {
    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("javaout.txt")) {
            int size = fin.available();
            System.out.println("File bytes: "+size);

            for(int i = 0; i< size; i++) {
                System.out.print((char)fin.read());
            }
            System.out.println("");

        }catch(IOException ioe) {
            System.out.println("Not able to read the file");
        }

    }
}