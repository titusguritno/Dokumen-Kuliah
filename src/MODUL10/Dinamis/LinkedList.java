package MODUL10.Dinamis;
/**
 *
 * @author Titus Guritno
 */
public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }

    public void addBefore(int x, ListNode bantu) {
        ListNode baru = new ListNode(x);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public int removeFirst() {
        return remove(head.next);
    }

    public int removeLast() {
        return remove(head.prev);
    }
    
    public int remove(ListNode bantu) {
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        size--;
        return bantu.elemen;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String temp = "";

        ListNode bantu = head.next;
        while (bantu != head) {
            temp = temp + bantu.elemen + " ";
            bantu = bantu.next;
        }
        return temp;
    }
    public ListNode Search(int search){
        
        ListNode bantu = head.next;
        while (bantu != head){
            if(bantu.elemen == search){
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }
}
