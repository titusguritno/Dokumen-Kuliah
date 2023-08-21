package Sorting;
/**
 *
 * @author Titus Guritno
 */
public class Larik {
    public static void BubleSort(int larik[]) {
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            for (int elemen = 0; elemen < larik.length - 1; elemen++) {
                if (larik[elemen] > larik[elemen + 1]) {
                    int x = larik[elemen];
                    larik[elemen] = larik[elemen + 1];
                    larik[elemen + 1] = x;
                }
            }
        }
    }

    public static void selectionSort(int larik[]) {
        for (int iterasi = 0; iterasi < larik.length - 1; iterasi++) {
            int minIndex = iterasi;
            for (int elemen = iterasi + 1; elemen < larik.length; elemen++) {
                if (larik[elemen] < larik[minIndex]) {
                    minIndex = elemen;
                    int x = larik[elemen];
                    larik[elemen] = larik[minIndex];
                    larik[minIndex] = x;
                }
            }
        }
    }

    public static void insertSort(int larik[]) {

        for (int iterasi = 1; iterasi < larik.length; iterasi++) {
            int elemen = iterasi;

            while ((elemen > 0) && (larik[elemen - 1] > larik[elemen])) {
                int x = larik[elemen];
                larik[elemen] = larik[elemen - 1];
                larik[elemen - 1] = x;
                elemen--;
            }
        }
    }
}
