import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // create a vector
        Vector<String> myVector = new Vector<String>();
        
        // append elements to the vector
        myVector.add("apple");
        myVector.add("banana");
        myVector.add("orange");
        
        // display the vector
        System.out.println("Vector elements: " + myVector);
        
        // remove an element from the vector
        myVector.remove("banana");
        
        // display the modified vector
        System.out.println("Vector elements after removal: " + myVector);
    }
}
