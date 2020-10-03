import java.util.*;

/**
 * Program to demonstrate Collections
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(10);

        System.out.println("ArrayList contents: "+ array);

        System.out.println("After removing 30");
        array.remove(2);

        System.out.println(array);

        //Elements are not sorted in HashSet. To get the elements in the order of insertion, use LinkedHashSet
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");
        System.out.println("HashSet contents: "+set);

        System.out.println("After removing C");
        set.remove("C");

        System.out.println(set);


        //Treeset: Objects are sorted in ascending order while storing
        TreeSet<String> tree = new TreeSet<>();
        tree.add("C");
        tree.add("B");
        tree.add("D");
        tree.add("A");

        System.out.println("TreeSet Contents: "+tree);
        System.out.println("After removing C");
        tree.remove("C");
        System.out.println(tree);

        System.out.println("updating the items in arrayList");

        //Iterating through a collection

        //1. Obtain the iterator from the arrayList

        Iterator<Integer> iterator = array.iterator();
        while(iterator.hasNext()) {
            Integer item = iterator.next() + 10;
            System.out.println("Item: "+item);
        }

    }
}
