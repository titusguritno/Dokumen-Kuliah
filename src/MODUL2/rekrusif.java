package Modul_2;
import java.util.Scanner;
/**
 *
 * @author Titus Guritno
 */
public class rekrusif {
    public static void header(String header) {
        System.out.println(header);
    }

    static int pangkat(int bil, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return bil * pangkat(bil, pangkat - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        header("Bilangan X pangkat Y");
        System.out.print("Bilangan X : ");
        int bil = input.nextInt();
        System.out.print("Bilangan Y : ");
        int pangkat = input.nextInt();
        int hasil = pangkat(bil, pangkat);
        System.out.print("Hasil = " + hasil);
        System.out.println("");
    }
}
