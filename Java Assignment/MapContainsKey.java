import java.util.HashMap;
import java.util.Map;

public class MapContainsKey {
    public static void main(String[] args) {
        // create a HashMap
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        
        // add mappings to the map
        myMap.put("apple", 1);
        myMap.put("banana", 2);
        myMap.put("orange", 3);
        
        // check if the map contains a mapping for the specified key
        if (myMap.containsKey("banana")) {
            System.out.println("The map contains a mapping for the key 'banana'");
        } else {
            System.out.println("The map does not contain a mapping for the key 'banana'");
        }
    }
}
