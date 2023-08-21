package AdvanceSort;
/**
 *
 * @author Titus Guritno
 */
public class QuickSort {
    public static void quicksort(int data[], int awal, int akhir) {
        int index = quick(data, awal, akhir);

        if (awal < index - 1) {
            quicksort(data, awal, index - 1);
        }
        if (index < akhir) {
            quicksort(data, index, akhir);
        }
    }

    public static int quick(int x[], int awal, int akhir) {
        int pivot = x[(awal + akhir) / 2];
        while (awal <= akhir) {
            while (x[awal] < pivot) {
                awal++;
            }
            while (x[akhir] > pivot) {
                akhir--;
            }

            if (awal <= akhir) {
                int y = x[awal];
                x[awal] = x[akhir];
                x[akhir] = y;

                awal++;
                akhir--;
            }
        }
        return awal;

    }

}
