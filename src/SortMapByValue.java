import java.util.*;

public class SortMapByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 1);
        map.put("cherry", 5);
        map.put("date", 2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort by value
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted Map by Value:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}