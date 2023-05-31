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
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
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
