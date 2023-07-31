package exercise;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int n) {
        list.sort(Comparator.comparingDouble(Home::getArea));
        return list.stream()
                .limit(n)
                .map(Object::toString)
                .toList();
    }
}
// END
