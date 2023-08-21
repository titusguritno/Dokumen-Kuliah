package MODUL9.Dinamis;
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

    public int remove(ListNode bantu) {
        bantu.prev.next = bantu.next;
        bantu.next.prev = bantu.prev;
        bantu.prev = null;
        bantu.next = null;
        size--;
        return bantu.elemen;
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

    public int size() {
        return size;
    }

    public ListNode Search(int x) {
        ListNode bantu = head.next;
        while (bantu != head) {
            if (x == bantu.elemen) {
                return bantu;
            }
            bantu = bantu.next;
        }
        return null;
    }

    public boolean isEmpty() {
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
    }

    public void cetak() {
        ListNode bantu = head.next;
        while (bantu != head) {
            System.out.print(bantu.getElemen() + " ");
            bantu = bantu.next;
        }
        System.out.println("");
    }
}
