package UASSDLA_205314110;
import java.util.Stack;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        String huruf = "Titus Guritno";
        String hasil = "";

        int jumlah = huruf.length();
        int jumlahHuruf = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + huruf.charAt(jumlahHuruf);
            jumlahHuruf--;
        }
        System.out.println("Output: " + hasil);
    }
}
