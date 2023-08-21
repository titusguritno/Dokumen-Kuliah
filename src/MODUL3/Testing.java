package Searching;
/**
 *
 * @author Titus Guritno
 */
public class Testing {
    public static void main(String[] args) {
        int[] data = {22, 34, 28, 12, 7, 18, 29, 42, 39, 45, 55, 48, 26, 66, 56,
            32, 17, 9, 79, 63, 95, 88, 73, 59, 40, 67, 2, 77, 92, 10};
        int kunci = 48;

        Larik larik = new Larik();
        //  SequentialSearch
        int hasil = larik.squentialSearch(data, kunci);
        if (hasil != -1) {
            System.out.println("Data ada pada indeks " + hasil + "\n");
        } else {
            System.out.println("Data tidak ditemukan\n");
        }
    }
}


//        //  BinarySearch
//        Arrays.sort(data);
//        int hasil2 = larik.binarySearch(data, kunci);
//        if (hasil2 != -1) {
//            System.out.println("Data ada pada indeks " + hasil2);
//        } else {
//            System.out.println("Data tidak ditemukan");
//        }
//    }
//}
