package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> list) {
        return (int) list.stream()
                .filter(x -> x.endsWith("gmail.com") || x.endsWith("hotmail.com") || x.endsWith("yandex.ru"))
                .count();
    }
}
// END
