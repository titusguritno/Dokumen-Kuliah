package AdvanceSort;
import java.util.Arrays;
/**
 *
 * @author Titus Guritno
 */
public class MainProgram {
    public static void main(String[] args) {
        int[] data = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 33, 63, 5, 8, 15, 20};
        System.out.println("Larik");
        System.out.println(Arrays.toString(data));
        
        System.out.println();
        System.out.println("Sudah diurut menggunakan Quick Sort");
        QuickSort.quicksort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));

        System.out.println();
        System.out.println("Sudah diurut menggunakan Merge Sort");
        MergeSort.mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));

    }
}
