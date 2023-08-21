package MODUL9.Statis;
import java.util.NoSuchElementException;
/**
 *
 * @author Titus Guritno
 */
public class Stack {
    int[] elemen;
    int front;
    int size;

    public Stack() {
    }

    public Stack(int ukuran) {
        front = -1;
        elemen = new int[ukuran];
        size = 0;
    }

    public boolean Push(int tambah) {
        if (size < elemen.length) {
            front = front + 1;
            elemen[front] = tambah;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int Pop() {
        if (!isEmpty()) {
            int temp = elemen[front];
            front = front - 1;
            size--;
            return temp;
        } else {
            throw new NoSuchElementException();
        }

    }

    public int Size() {
        return size;
    }

    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void cetak() {
        for (int i = 0; i < size; i++) {
            System.out.print(elemen[i] + " ");
        }
        System.out.println("");
    }
}
