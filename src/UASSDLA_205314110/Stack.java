package UASSDLA_205314110;
import java.util.NoSuchElementException;
/**
 *
 * @author Titus Guritno
 */
public class Stack {
    private char[] elemen;
    private int front;
    private int size;

    public Stack() {

    }

    public Stack(char ukuran) {
        front = -1;
        elemen = new char[ukuran];
        size = 0;
    }

    public char[] getElemen() {
        return elemen;
    }

    public void setElemen(char[] elemen) {
        this.elemen = elemen;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean push(char data) {
        if (size < elemen.length) {
            front++;
            elemen[front] = data;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int hapus = elemen[front];
            front--;
            size--;

            return hapus;
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                System.out.print(elemen[i] + " ");
            }
            System.out.println("");

        } else {
            System.out.println("Data Kosong!");
        }
    }
}
