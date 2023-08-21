package MODUL9.Dinamis;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Stack tumpukan = new Stack();
        tumpukan.Push(26);
        tumpukan.cetak();
        tumpukan.Push(15);
        tumpukan.cetak();
        tumpukan.Push(8);
        tumpukan.cetak();
        tumpukan.Push(14);
        tumpukan.cetak();
        System.out.println("Data terhapus : "+tumpukan.Pop());
        System.out.println("Data terhapus : "+tumpukan.Pop());
        System.out.print("Data yang tersisa : ");
        tumpukan.cetak();
    }
}
