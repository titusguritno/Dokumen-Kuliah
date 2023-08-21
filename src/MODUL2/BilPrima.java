package Modul_2;
/**
 *
 * @author Titus Guritno
 */
public class BilPrima {

    public static int bilPrima(int x, int y) {
        if (y == 1) {
            return 1;
        }
        if (y == 0) {
            return 0;
        } else if (x % y == 0) {
            return 0;
        } else {
            return bilPrima(x, y - 1);
        }

    }

    public static void main(String[] args) {
    //  Output 2 3 5 7 
        System.out.println("Bilangan Prima");
        for (int i = 1; i <= 10; i++) {
            if (bilPrima(i, i - 1) == 1) {
                System.out.print(i + " ");
            }

        }
        System.out.println();

    //  Membuat Output 7 5 3 2 
        for (int i = 10; i >= 1; i--) {
            if (bilPrima(i, i - 1) == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
