package selectionSort;

import java.util.List;

public class Swap {


    public static <T> List<T> getSwap(List<T> elements, int i, int j) {
        T a = elements.get(j);
        elements.set(j, elements.get(i));
        elements.set(i, a);
        return elements;
    }
}
