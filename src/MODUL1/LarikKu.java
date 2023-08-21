package MODUL1;

/**
 *
 * @author LENOVO
 */
public class LarikKu {

    private Double[] data;
    private int maxData;
    private int jumlahData = 0;

    LarikKu(int maxData) {
        this.maxData = maxData;
        this.data = new Double[maxData];
    }

    public void tambahBelakang(double data) {
        ++jumlahData;
        this.data[jumlahData - 1] = data;
    }

    public void tambahDepan(double data) {
        ++jumlahData;
        Double[] copy = new Double[jumlahData];
        for (int i = 0; i < jumlahData; i++) {
            copy[i] = this.data[i];
        }
        for (int i = 0; i < jumlahData; i++) {
            this.data[i + 1] = copy[i];
        }
        this.data[0] = data;
    }

    public void printData() {
        String StringData = "";
        System.out.println("Jumlah Data 	= " + this.jumlahData);
        for (int i = 0; i < jumlahData; i++) {
            StringData += String.valueOf(this.data[i]) + "; ";
        }
        System.out.println("Larik		= " + StringData);
        System.out.println("");
        StringData = "";
    }

    public void cariData(double data) {
        boolean cek = false;
        int ans = 0;
        for (int i = 0; i < jumlahData; i++) {
            if (this.data[i] == data) {
                cek = true;
                if (cek == true) {
                    ans = i;

                    System.out.println(data + " ada di-indeks no : " + ans);
                    System.out.println("");
                    break;
                } else {
                    continue;
                }
            }

        }
        if (cek == false) {
            System.out.println(data + " tidak ada di larik");
        }
    }
}
