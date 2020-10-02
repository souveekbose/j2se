import java.io.*;
/**
 * Program to create a File and Directory
 */
public class FileOutStream {
    public static void main(String[] args) {

        try (FileOutputStream fout = new FileOutputStream("javaout.txt", true)) {
            String data = "\nThis text should be written as bytes to file";

            byte[] b = data.getBytes();

            for (int i = 0; i < b.length; i++) {
                fout.write(b[i]);
            }
        }catch(IOException ioe) {
            System.out.println("Not able to write to file");
        }
    }
}