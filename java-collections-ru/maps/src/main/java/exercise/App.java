package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {


    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (sentence.isEmpty()) return map;
        String[] splitter = sentence.split(" ");
        for (String word : splitter) {
            int count = map.getOrDefault(word, 0);
            count += 1;
            map.put(word, count);
        }
        return map;
    }

    public static String toString(Map<String, Integer> map) {
        StringBuilder result = new StringBuilder();
        if (map.isEmpty()) return "{}";
        result.append("{").append("\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
