package exercise;

import java.util.LinkedHashMap;
import java.util.Map;


// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> firstMap, Map<String, Object> secondMap) {
        Map<String, String> result = new LinkedHashMap<>();
        for (String key : firstMap.keySet()) {
            if (!secondMap.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!firstMap.get(key).equals(secondMap.get(key))) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        }
        for (String key : secondMap.keySet()) {
            if (!firstMap.containsKey(key)) {
                result.put(key, "added");
            }
        }
        return result;
    }
}
//END
