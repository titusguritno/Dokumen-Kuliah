package MODUL8;
/**
 *
 * @author Titus Guritno
 */
public class MainProgram {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();

        System.out.println("Tambahkan Data");
        link.addFirst(8);
        System.out.print("Tambah 8 diawal : ");
        link.toString();

        link.addFirst(15);
        System.out.print("Tambah 15 diawal : ");
        link.toString();

        link.addLast(26);
        System.out.print("Tambah 26 diakhir : ");
        link.toString();

        link.addLast(14);
        System.out.print("Tambah 14 diakhir : ");
        link.toString();

        System.out.println("");
        System.out.println(link.search(15));
        System.out.println("");

        System.out.println("Hapus Data");
        link.removeLast();
        System.out.print("Hilangkan data diakhir : ");
        link.toString();

        link.removeLast();
        System.out.print("Hilangkan data diakhir : ");
        link.toString();

        link.removeFirst();
        System.out.print("Hilangkan data diawal : ");
        link.toString();

        link.removeFirst();
        System.out.println("Hilangkan data diawal : ");
        link.toString();
    }
}
