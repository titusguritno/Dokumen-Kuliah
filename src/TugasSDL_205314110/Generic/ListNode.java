package TugasSDL_205314110.Generic;
/**
 *
 * @author Titus Guritno
 */
public class ListNode<E> {
    public E element;
    public ListNode next, prev;

    public ListNode(){
    
    }
    
    public ListNode(E element){
        this.element = element;
    }
    
    public ListNode(E element, ListNode next, ListNode prev){
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
    
    public E getElement() {
        return element;
    }
    
    public void setElement(E element) {
        this.element = element;
    }

    public ListNode getNext() {
        return next;
    }
    
    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }
    
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
