package TugasSDL_205314110.Generic;
/**
 *
 * @author
 */
public class Mahasiswa {
    private String nama, prodi, alamat;
    private int nim;
    
    public Mahasiswa(String nama, int nim, String prodi, String alamat){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
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
    
    public String toString(){
        return "Nama\t: " + nama + 
                "\nNIM\t: " + nim +
                "\nProdi\t: " + prodi + 
                "\nAlamat\t: " + alamat + 
                "\n\n";
    }
}
