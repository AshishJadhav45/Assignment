import java.util.ArrayList;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // Add elements to the first list
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Add elements to the second list
        list2.add(1);
        list2.add(2);
        list2.add(4);

        // Compare the two lists
        boolean isEqual = list1.equals(list2);

        // Print the result
        if (isEqual) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }
    }
}
