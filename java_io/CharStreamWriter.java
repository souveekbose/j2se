import java.io.*;
/**
 * Program to create a File and Directory
 */
public class CharStreamWriter {
    public static void main(String[] args) {

        String data = "This text should be written as chars in text file";

        try(FileWriter fw = new FileWriter("java.txt", true)) {

           char[] buf = new char[data.length()];
           data.getChars(0,data.length(), buf, 0);

           for(int i=0; i<buf.length; i++) {
               fw.write(buf[i]);
            }
            System.out.println("");

        }catch(IOException ioe) {
            System.out.println("Not able to read the file");
        }

    }
}