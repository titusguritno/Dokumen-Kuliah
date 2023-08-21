package TugasSDL_205314110.Generic;
/**
 *
 * @author Titus Guritno
 */
public class Stack<E> {
    LinkedList tumpukan;
    
    public Stack(){
        tumpukan = new LinkedList();
    }
    
    public void push(E data){
        tumpukan.addFirst((E) data);
    }
    public E pop(){
        return (E) tumpukan.removeFirst();
    }
    
    public int size(){
        return tumpukan.size();
    }
    
    public boolean isEmpty(){
        return tumpukan.isEmpty();
    }
    
    public void cetak(){
        tumpukan.cetak();
    }
}
