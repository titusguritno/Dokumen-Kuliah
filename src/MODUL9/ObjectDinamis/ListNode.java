package MODUL9.ObjectDinamis;
/**
 *
 * @author Titus Guritno
 */
public class ListNode {
    Object elemen;
    ListNode next;
    ListNode prev;

    public ListNode() {

    }

    public ListNode(Object elemen) {
        this.elemen = elemen;
    }

    public ListNode(Object elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }
}
