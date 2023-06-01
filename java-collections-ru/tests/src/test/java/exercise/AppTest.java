package exercise;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> testList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> result1 = App.take(testList, 2);
        Assertions.assertEquals(result1.size(), 2);

        List<Integer> result2 = App.take(testList, 3);
        Assertions.assertEquals(result2.size(), 3);

        List<Integer> result3 = App.take(testList, 4);
        Assertions.assertEquals(result3.size(), 4);

        List<Integer> result4 = App.take(testList, 0);
        Assertions.assertEquals(result4.size(), 0);
        // END
    }
}
