package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String word1, String word2) {
        String[] spliter = word1.split("");
        List<String> charsFromWord1 = new ArrayList<>(Arrays.asList(spliter));
        for (int i = 0; i < word2.length(); i++) {
            String lowerCase = word2.substring(i, i + 1).toLowerCase();
            if (charsFromWord1.contains(lowerCase)) {
                charsFromWord1.remove(lowerCase);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
