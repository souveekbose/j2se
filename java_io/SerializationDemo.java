import java.io.*;
/**
 * Program to demonstrate serialization
 */
public class SerializationDemo {
    public static void main(String[] args) {
        Student student1 = new Student(10,"Alice");

        try(
                FileOutputStream fo = new FileOutputStream("objectFile.txt");
                ObjectOutputStream oo = new ObjectOutputStream(fo);
        ) {
            oo.writeObject(student1);

        }catch(IOException ioe) {
            System.out.println("Not able to write objects");
        }
    }
}

class Student implements Serializable {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    String getName() {
        return name;
    }
}