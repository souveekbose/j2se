import java.io.*;
/**
 * Program to demonstrate Deserialization
 */
public class DeserializationDemo {
    public static void main(String[] args) {

        try(
                FileInputStream fi = new FileInputStream("objectFile.txt");
                ObjectInputStream oi = new ObjectInputStream(fi);
        ) {
            Object object = oi.readObject();
            //Typecast to required class
            Student student2 = (Student) object;
            System.out.println(student2.getName());

        }catch(IOException | ClassNotFoundException e) {
            System.out.println("Not able to write objects");
        }
    }
}