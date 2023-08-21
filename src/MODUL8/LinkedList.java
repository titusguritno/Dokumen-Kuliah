package MODUL8;
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

    public void addBefore(int x, ListNode help) {
        ListNode LN = new ListNode(x);
        LN.next = help;
        LN.prev = help.prev;
        help.prev.next = LN;
        help.prev = LN;
        size++;
    }

    public int remove(ListNode help) {
        help.prev.next = help.next;
        help.next.prev = help.prev;
        help.prev = null;
        help.next = null;
        size--;
        return help.elemen;
    }

    public void addFirst(int elemen) {
        addBefore(elemen, head);
    }

    public void addLast(int elemen) {
        addBefore(elemen, head);
    }

    public int removeFirst() {
        return remove(head.prev);
    }

    public int removeLast() {
        return remove(head.prev);
    }

    public int size() {
        return size;
    }

    public int search(int elemen) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        ListNode temp = head;

        while (temp != null) {
            if (temp.elemen == elemen) {
                System.out.print("Data ditemukan :");
                return elemen;
            }
            index++;
            temp = temp.next;
        }
        // Returns -1 if the element is not found
        return -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String art = "";
        ListNode help = head.next;
        if (help == head) {
            System.out.println("Data sudah dihapus!");
        } else {
            while (help != head) {
                System.out.print("{" + help.elemen + "}");
                help = help.getNext();
            }
            System.out.println();
        }
        return art;
    }
}
