package MODUL9.ObjectStatis;
import java.util.NoSuchElementException;
/**
 *
 * @author Titus Guritno
 */
public class Stack {
    Object[] elemen;
    int front;
    int size;

    public Stack() {
    }

    public Stack(int ukuran) {
        front = -1;
        elemen = new Object[ukuran];
        size = 0;
    }

    public Object Push(Object tambah) {
        if (size < elemen.length) {
            front = front + 1;
            elemen[front] = tambah;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public Object Pop() {
        if (!isEmpty()) {
            Object temp = elemen[front];
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
            System.out.print(elemen[i] +" ");
        }
        System.out.println("");
    }
}
