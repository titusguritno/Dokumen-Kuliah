package MODUL10.Dinamis;
/**
 *
 * @author Titus Guritno
 */
public class Queue {
    LinkedList antrian;
    
    public Queue(LinkedList antrian) {
        this.antrian = antrian;
    }
    
    Queue (){
        antrian = new LinkedList();
    }
    
    void enqueue (int data){
        antrian.addLast(data);
    }
    int dequeue(){
        return antrian.removeFirst();
    }
    public int Size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        if (antrian.size() == -1){
            return true;
        } 
        return false;
    }
    
    public void cetak(){
        System.out.println(antrian.toString());
    }
}
