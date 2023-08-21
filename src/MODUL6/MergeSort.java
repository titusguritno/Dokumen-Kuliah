package AdvanceSort;
/**
 *
 * @author Titus Guritno
 */
public class MergeSort {
    public static void mergeSort(int arr[], int awal, int akhir) {
        if (awal < akhir) {
            int tengah = (awal + akhir) / 2;
            mergeSort(arr, awal, tengah);
            mergeSort(arr, tengah + 1, akhir);
            merge(arr, awal, tengah, akhir);
        }
    }

    public static void merge(int arr[], int awal, int tengah, int akhir) {
        int n1 = tengah - awal + 1;
        int n2 = akhir - tengah;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[awal + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[tengah + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = awal;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

}
