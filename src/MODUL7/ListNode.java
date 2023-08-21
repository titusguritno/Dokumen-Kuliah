package Modul7;
/**
 *
 * @author Titus Guritno
 */
public class ListNode {
    private int data;
    private ListNode next;

    ListNode(int data, ListNode node) {
        this.data = data;
        next = null;
    }

    ListNode(int data) {
        this(data, null);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
