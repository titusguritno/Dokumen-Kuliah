package proyekSdl;
public class Queue<E> {
    LinkedList antrian;
    
    public Queue() {
        antrian = new LinkedList();
    }
    
    public void enqueue(E data) {
        antrian.addLast((E) data);
    }
    
    public E dequeue() {
        return (E) antrian.removeFirst();
    }
    
    public int size() {
        return antrian.size();
    }
    
    public boolean isEmpty() {
        return antrian.isEmpty();
    }
    
    public void cetak() {
        antrian.cetak();
    }
}
