package MODUL9.ObjectDinamis;
/**
 *
 * @author Titus Guritno
 */
public class LinkedList {
    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.prev = head;
        head.next = head;
        size = 0;
    }

    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void addBefore(Object ob, ListNode bantu) {
        ListNode baru = new ListNode(ob);
        baru.next = bantu;
        baru.prev = bantu.prev;
        bantu.prev.next = baru;
        bantu.prev = baru;
        size++;
    }

    public Object remove(ListNode bantu) {
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        bantu.prev = null;
        bantu.next = null;
        size--;
        return bantu.elemen;
    }

    public void addFirst(Object elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    public ListNode search(Object x) {
        ListNode bantu = head.next;
        while (bantu != head) {
            if (((Comparable) bantu.elemen).compareTo(x) == 0) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }

    public void cetak() {
        ListNode bantu = head.next;
        while (bantu != head) {
            System.out.print(bantu.elemen + " ");
            bantu = bantu.next;
        }
        System.out.println("");
    }
}
