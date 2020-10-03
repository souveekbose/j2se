import java.util.*;

/**
 * Program to demonstrate Map
 */
public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");

        //Get a set of Entries

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        }

    }
}
