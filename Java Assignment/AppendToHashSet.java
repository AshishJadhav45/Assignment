import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        
        // add elements to the HashSet
        myHashSet.add("apple");
        myHashSet.add("banana");
        myHashSet.add("orange");
        
        // display the original HashSet
        System.out.println("Original HashSet: " + myHashSet);
        
        // append the specified element to the end of the HashSet
        myHashSet.add("grape");
        
        // display the modified HashSet
        System.out.println("Modified HashSet: " + myHashSet);
    }
}
