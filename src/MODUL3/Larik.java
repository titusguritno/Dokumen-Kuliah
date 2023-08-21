package Searching;
/**
 *
 * @author Titus Guritno
 */
public class Larik {
    public int squentialSearch(int[] data, int kunci) {
        int counter = data.length;
        for (int i = 0; i < counter; i++) {
            if (data[i] == kunci) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int[] data, int kunci) {
        int atas = data.length - 1;
        int bawah = 0;

        while (atas >= bawah) {
            int tengah = (bawah + atas) / 2;

            if (kunci < data[tengah]) {
                atas = tengah - 1;
            } else if (kunci == data[tengah]) {
                return tengah;
            } else {
                bawah = tengah + 1;
            }
        }
        return -1;
    }
}
