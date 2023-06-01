package exercise;


import java.util.List;
import java.util.Map;
import java.util.ArrayList;


// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> pairs) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book : books) {
            if (compareMaps(book, pairs)) {
                result.add(book);
            }
        }
        return result;
    }

    public static boolean compareMaps(Map<String, String> map1, Map<String, String> map2) {
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!map1.containsKey(key) || !map1.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }
}
//END
