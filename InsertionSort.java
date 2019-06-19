public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {9,14,3,2,43,11,58,22};
        insertionSort(arr1);
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int[] insertion) {
        for (int j = 1; j < insertion.length; j++) {
            int key = insertion[j];
            int i = j-1;
            while ( (i > -1) && ( insertion [i] > key ) ) {
                insertion [i+1] = insertion [i];
                i--;
            }
            insertion[i+1] = key;
        }
    }
}
