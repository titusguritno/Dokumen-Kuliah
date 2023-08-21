/**
 *
 * @author LENOVO
 */
public class iterasi1 {
    public static void main(String[] args) {
        long n = 1000;
        long jumlah = 0;
        long startTimestamp = System.currentTimeMillis();
        long totalTime = 0;
        System.out.println("Jumlah Perulangan yang diinginkan");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    jumlah = jumlah + i;
                }
            }
        }
        totalTime = (System.currentTimeMillis() - startTimestamp);

        System.out.println("Total : " + jumlah);
        System.out.println("totalTime : " + totalTime);
    }
}
