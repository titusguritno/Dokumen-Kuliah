package MODUL9.ObjectDinamis;
/**
 *
 * @author Titus Guritno
 */
public class Stack {
    LinkedList tumpukan;
    public Stack() {
        tumpukan = new LinkedList();
    }

    public void Push(Object elemen) {
        tumpukan.addFirst((Mahasiswa)elemen);
    }

    public Object Pop() {
        return tumpukan.removeFirst();
    }

    public int size() {
        return tumpukan.getSize();
    }

    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }
 
    public void cetak() {
        tumpukan.cetak();
    }
}
