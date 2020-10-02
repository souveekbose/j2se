import java.io.*;
/**
 * Program to demonstrate serialization
 */
public class SerializationDemo {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("java.txt")) {

            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char)c);

            }
            System.out.println("");


        }catch(IOException ioe) {
            System.out.println("Not able to read the file");
        }

    }
}