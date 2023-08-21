package MODUL10.Static;
import java.util.NoSuchElementException;
/**
 *
 * @author Titus Guritno
 */
public class Queue {
    int elemen[];
    int front;
    int rear;
    int size;

    public Queue() {}
    
    public Queue(int ukuran) {
        elemen = new int [ukuran];
    }
    
    boolean enqueue(int data) {
        if (size < elemen.length) {
            elemen[rear] = data;
            if (rear == elemen.length - 1) {
                rear = 0;
            } else {
                rear++;
            }
            size++;
            return true;
        }
        return false;
    }

    int dequeue (){
        if (elemen.length != 0){
            int hapus = elemen[front];
            if (front == elemen.length - 1){
                front = 0;
            } else {
                front++;
            }
            size--;
            return hapus;
        }
        throw new NoSuchElementException();
    }
    public int Size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void cetak(){
        for (int i = front; i < rear; i++) {
            System.out.print(elemen[i]+" ");
        }
        System.out.println("");
    }
}
