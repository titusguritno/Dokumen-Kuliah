package MODUL9.ObjectStatis;
/**
 *
 * @author Titus Guritno
 */
public class Mahasiswa {
    private String nama, prodi, alamat;
    private int nim;

    public Mahasiswa(int nim, String nama, String prodi, String alamat) {
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String toString() {
        return "\n" + "Nama \t\t: " + nama + "\nNIM\t\t: "
             + nim + "\nProdi\t\t: " + prodi + "\nAlamat\t\t: " + alamat + "\n";
    }
}
