import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding Elements to ArrayList
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Accessing Elements in an ArrayList
        int element = list.get(0);
        System.out.println(element);

        // Modifying Elements
        list.add(1, 1);
        System.out.println(list);

        // Removing Elements
        list.remove(3);
        System.out.println(list);

        // set Elements
        list.set(0, 5);
        System.out.println(list);

        // ArrayList size
        int size = list.size();
        System.out.println(size);

        // Iterating Through an ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
