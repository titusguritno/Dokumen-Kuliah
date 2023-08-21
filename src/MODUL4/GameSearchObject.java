package Searching_Object;
import java.util.Arrays;
/**
 *
 * @author Titus Guritno
 */
public class GameSearchObject {
    public static void main(String[] args) {
        Game[] player = new Game[6];
        player[0] = new Game(657, "Jack");
        player[1] = new Game(387, "Bill");
        player[2] = new Game(799, "Max");
        player[3] = new Game(245, "Sam");
        player[4] = new Game(678, "Josh");
        player[5] = new Game(498, "Wilson");
        System.out.println("List Gamer");
        LarikGame.cetak(player);

        System.out.println("");
        System.out.println("Sequential Search Object");

        Game key = new Game(498, "Wilson");

        int hasil = LarikGame.sequentialObject(player, key);

        if (hasil == -1) {
            System.out.println("Pemain : " + key.getNama() + " ,dan Score "
                    + key.getScore() + " tidak ditemukan");
        } else {
            System.out.println("Pemain : " + key.getNama() + " ,dan Score "
                    + key.getScore() + " berada pada index ke-" + hasil);
        }
        System.out.println();
        System.out.println("Binary Search Object");
        System.out.println("");
        Arrays.sort(player);

        Game biner = new Game(498, "Wilson");
        hasil = LarikGame.binaryObject(player, biner);
        LarikGame.cetak(player);
        System.out.println("");
        if (hasil == -1) {
            System.out.println("Pemain : " + biner.getNama() + " ,dan Score "
                    + biner.getScore() + " tidak ditemukan");
        } else {
            System.out.println("Pemain: " + biner.getNama() + " ,dan Score "
                    + biner.getScore() + " berada pada index ke-" + hasil);
        }
        System.out.println();
        System.out.println("Interpolasi Object");

        Game inter = new Game(498, "Wilson");
        hasil = LarikGame.interpolationObject(player, inter);
        if (hasil == -1) {
            System.out.println("Pemain : " + inter.getNama() + " ,dan Score  "
                    + inter.getScore() + " tidak ditemukan");
        } else {
            System.out.println("Pemain : " + inter.getNama() + " ,dan Score  "
                    + inter.getScore() + " berada pada index ke-" + hasil);
        }
    }
}
