package proyekSdl;
public class Barang {
	protected String namaBrg;
	protected String jumlahBarang;
	protected String harga;
	protected String metodePembayaran;

	public Barang() {
	}

	public String getNamaBrg() {
		return namaBrg;
	}

	public void setNamaBrg(String namaBrg) {
		this.namaBrg = namaBrg;
	}

	public String getJumlahBarang() {
		return jumlahBarang;
	}

	public void setJumlahBarang(String jumlahBarang) {
		this.jumlahBarang = jumlahBarang;
	}

	public String getHarga() {
		return harga;
	}

	public void setHarga(String harga) {
		this.harga = harga;
	}

	public String getMetodePembayaran() {
		return metodePembayaran;
	}

	public void setMetodePembayaran(String metodePembayaran) {
		this.metodePembayaran = metodePembayaran;
	}

	public String getTotal() {
		return String.valueOf(Integer.valueOf(getHarga()) * 
                Integer.valueOf(getJumlahBarang()));
	}
}
