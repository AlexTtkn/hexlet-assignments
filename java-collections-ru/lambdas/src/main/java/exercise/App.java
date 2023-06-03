package exercise;


import java.util.Arrays;
import java.util.stream.IntStream;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        String[][] enlargedImage = new String[image.length * 2][image.length * 2];
        IntStream.range(0, image.length)
                .flatMap(i -> IntStream.concat(IntStream.of(i * 2, i * 2 + 1), IntStream.of(i * 2, i * 2 + 1)))
                .forEach(i -> IntStream.range(0, image.length)
                        .flatMap(j -> IntStream.concat(IntStream.of(j * 2, j * 2 + 1), IntStream.of(j * 2, j * 2 + 1)))
                        .forEach(j -> enlargedImage[i][j] = image[i / 2][j / 2]));

        return enlargedImage;
    }
}
// END
