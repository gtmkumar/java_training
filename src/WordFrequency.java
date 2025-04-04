import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "people love to love people";
        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
