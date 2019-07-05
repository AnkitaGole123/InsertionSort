package insertionSortTest;

import insertionSort.InsertionSort;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class insertionSortTest {
    @Test
    public void itShouldSortTheListOfInteger() {
        List<Integer> elements = Arrays.asList(2, 6, 8, 3, 5, 4);
        List<Integer> expected = Arrays.asList(2, 3, 4, 5, 6, 8);
        assertEquals(expected, InsertionSort.sort(elements));
    }

    @Test
    public void itShouldSortTheListOfString() {
        List<String> elements = Arrays.asList("a", "d", "k", "b");
        List<String> expected = Arrays.asList("a", "b", "d", "k");
        assertEquals(expected, InsertionSort.sort(elements));
    }

    @Test
    public void itShouldSortTheListOfDouble() {
        List<Double> elements = Arrays.asList(2.2, 6.2, 8.2, 3.2, 5.2, 4.2);
        List<Double> expected = Arrays.asList(2.2, 3.2, 4.2, 5.2, 6.2, 8.2);
        assertEquals(expected, InsertionSort.sort(elements));
    }
}
