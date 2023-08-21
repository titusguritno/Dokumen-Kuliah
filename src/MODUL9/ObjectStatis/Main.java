package MODUL9.ObjectStatis;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Stack tumpukan = new Stack(5);

        Mahasiswa mhs1 = new Mahasiswa(205314107, "Virgynus", "Informatika", "Adonara");
        tumpukan.Push(mhs1);
        Mahasiswa mhs2 = new Mahasiswa(205314117, "Chelvyn", "Informatika", "NTT");
        tumpukan.Push(mhs2);
        Mahasiswa mhs3 = new Mahasiswa(205314118, "Yosefina", "Informatika", "Manggarai");
        tumpukan.Push(mhs3);
        Mahasiswa mhs4 = new Mahasiswa(205314123, "Julita", "Informatika", "Pontiaanak");
        tumpukan.Push(mhs4);
        Mahasiswa mhs5 = new Mahasiswa(205314069, "Ferby", "Informatika", "Sekadau");
        tumpukan.Push(mhs5);
        System.out.println("Data terhapus : " + tumpukan.Pop());
        System.out.println("Data terhapus : " + tumpukan.Pop());
        System.out.println("Data terhapus : " + tumpukan.Pop());
        System.out.println("Data Yang Tersisa : ");
        tumpukan.cetak();
    }
}
