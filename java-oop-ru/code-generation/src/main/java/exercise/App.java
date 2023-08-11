package exercise;

import java.nio.file.Path;
import java.nio.file.Files;


// BEGIN
public class App {
    public static void save(Path path, Car car) throws Exception {
        String jsonStr = car.serialize();
        Files.write(path, jsonStr.getBytes());
    }

    public static Car extract(Path path) throws Exception {
        byte[] bytes = Files.readAllBytes(path);
        String jsonStr = new String(bytes);
        return Car.unserialize(jsonStr);
    }

}
// END
