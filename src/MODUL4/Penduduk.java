package Searching_Object;
/**
 *
 * @author Titus Guritno
 */
public class Penduduk implements Comparable {
    private String daerah;
    private int jmlh_Penduduk;

    public Penduduk(int jmlh_Penduduk, String daerah) {
        this.jmlh_Penduduk = jmlh_Penduduk;
        this.daerah = daerah;
    }

    public String getDaerah() {
        return daerah;
    }

    public void setDaerah(String daerah) {
        this.daerah = daerah;
    }

    public int getJmlh_Penduduk() {
        return jmlh_Penduduk;
    }

    public void setJmlh_Penduduk(int jmlh_Penduduk) {
        this.jmlh_Penduduk = jmlh_Penduduk;
    }

    public String toString() {
        return "Daerah{" + "Nama = " + daerah + ", Jumlah Penduduk = " 
                + jmlh_Penduduk + '}';
    }

    public int compareTo(Object o) {
        if (jmlh_Penduduk == ((Penduduk) o).getJmlh_Penduduk()) {
            return 0;
        } else if (jmlh_Penduduk > ((Penduduk) o).getJmlh_Penduduk()) {
            return 1;
        } else {
            return -1;
        }
    }
}
