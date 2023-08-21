package Searching_Object;
import java.util.Arrays;
/**
 *
 * @author Titus Guritno
 */
public class PendudukSearchObject {
    public static void main(String[] args) {
        Penduduk[] msy = new Penduduk[6];

        msy[0] = new Penduduk(889448, "Jakarta Pusat");
        msy[1] = new Penduduk(433539, "Yogyakarta");
        msy[2] = new Penduduk(506397, "Surakarta");
        msy[3] = new Penduduk(891467, "Bogor");
        msy[4] = new Penduduk(2029797, "Medan");
        msy[5] = new Penduduk(2288570,"Bandung");
        System.out.println("List Kependudukan");
        LarikPenduduk.cetak(msy);
        
        System.out.println("");
        System.out.println("Sequential Search Object");
       
       Penduduk key = new Penduduk(889448, "Jakarta Pusat");

        int hasil = LarikPenduduk.sequentialObject(msy, key);

        if (hasil == -1) {
            System.out.println("Daerah : " + key.getDaerah() + " ,dan Jumlah Penduduk " 
                    +key.getJmlh_Penduduk() + " tidak ditemukan");
        } else {
            System.out.println("Daerah : " + key.getDaerah() + " ,dan Jumlah Penduduk " 
                    +key.getJmlh_Penduduk() + " berada pada index ke-" + hasil);
        }

        System.out.println();
        System.out.println("Binary Search Object");
        System.out.println("");
        Arrays.sort(msy);
       
        Penduduk biner = new Penduduk(889448, "Jakarta Pusat");
        hasil = LarikPenduduk.binaryObject(msy, biner);
        LarikPenduduk.cetak(msy);
        System.out.println("");
        if (hasil == -1) {
            System.out.println("Daerah : " + biner.getDaerah() +" ,dan Jumlah Penduduk " 
                    +biner.getJmlh_Penduduk() + " tidak ditemukan");
        } else {
            System.out.println("Daerah: " + biner.getDaerah() +" ,dan Jumlah Penduduk " 
                    +biner.getJmlh_Penduduk() + " berada pada index ke-" + hasil);
        }
        System.out.println();
        System.out.println("Interpolasi Object");
       
        Penduduk inter = new Penduduk(889448, "Jakarta Pusat");
        hasil = LarikPenduduk.interpolationObject(msy, inter);
        if (hasil == -1) {

            System.out.println("Daerah : " + inter.getDaerah() +" ,dan Jumlah Penduduk  " 
                    +inter.getJmlh_Penduduk() + " tidak ditemukan");
        } else {
            System.out.println("Daerah : " + inter.getDaerah() +" ,dan Jumlah Penduduk  " 
                    +inter.getJmlh_Penduduk() + " berada pada index ke" + hasil);
        }
    }
}


