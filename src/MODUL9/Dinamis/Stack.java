package MODUL9.Dinamis;
/**
 *
 * @author Titus Guritno
 */
public class Stack {
    LinkedList tumpukan;

    public Stack() {
        tumpukan = new LinkedList();
    }

    public void Push(int elemen) {
        tumpukan.addFirst(elemen);
    }

    public int Pop() {
        return tumpukan.removeFirst();
    }

    public int size() {
        return tumpukan.size();
    }

    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }

    public void cetak() {
        tumpukan.cetak();
    }
}
