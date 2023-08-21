package Sorting;
import java.util.Arrays;
/**
 *
 * @author Titus Guritno
 */
public class TestingPengurutan {
    public static void main(String[] args) {
        int[] larik = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 
            33, 63, 5, 8, 15, 20};
        
        System.out.println("Larik sesudah diurutkan menggunakan bubble sort");
        Larik.BubleSort(larik);
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            System.out.print(larik[iterasi] + " , ");
        }

        System.out.println("\t");
        System.out.println("\t");
        System.out.println("Larik sesudah diurutkan menggunakan selection sort");
        Larik.selectionSort(larik);
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            System.out.print(larik[iterasi] + " , ");
        }
        
        System.out.println("\t");
        System.out.println("\t");
        System.out.println("Larik sesudah diurutkan menggunakan insert sort");
        Larik.selectionSort(larik);
        for (int iterasi = 0; iterasi < larik.length; iterasi++) {
            System.out.print(larik[iterasi] + " , ");
        }
        System.out.println("");
    }
}
