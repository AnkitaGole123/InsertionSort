package insertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(9,14,3,2,43,11,58,22);
        System.out.println(sort(arr1));

    }

    public static <T extends Comparable<T>> List<T> sort(List<T> elemnets) {
        List<T> copyElements = new ArrayList<>(elemnets);
        for (int i = 1; i < copyElements.size(); i++) {
            T valueCopyElementsOfI = copyElements.get(i);
            int j = i - 1;
            while (j >= 0 && valueCopyElementsOfI.compareTo(copyElements.get(j)) < 0) {
                selectionSort.Swap.getSwap(copyElements, j, j + 1);
                j--;
            }
        }
        return copyElements;
    }
}
