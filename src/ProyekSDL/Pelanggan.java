package proyekSdl;
public class Pelanggan extends Barang{
    private String nama;
    private String noPemesanan;
    private String noHp;
    private String alamat;
    
    public Pelanggan() {
    }
    
    public Pelanggan(String noPemesanan, String nama, String noHp, String alamat){
        this.nama = nama;
        this.noPemesanan = noPemesanan;
        this.noHp = noHp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoPemesanan() {
        return noPemesanan;
    }

    public void setNoPemesanan(String noPemesanan) {
        this.noPemesanan = noPemesanan;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String toString() {
        return "Nomor Pemesanan\t\t:"+noPemesanan+
                "\nNama\t\t\t:"+nama+
                "\nNo handphone\t\t:"+noHp+
                "\nNama Barang\t\t:"+namaBrg+
                "\nJumlah Barang\t\t:"+jumlahBarang+
                "\nHarga Barang\t\t:"+harga+
                "\nAlamat\t\t\t:"+alamat+
                "\nMetode Pembayaran\t:"+metodePembayaran+
                "\nTotal Pembayaran\t:"+getTotal()+
                "\n\n";
    }
}
 