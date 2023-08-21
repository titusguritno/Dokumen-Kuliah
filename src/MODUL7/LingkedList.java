package Modul7;
/**
 *
 * @author Titus Guritno
 */
public class LingkedList {
    private ListNode firstNode;
    private ListNode lastNode;
    private String nama;

    LingkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    LingkedList(String s) {
        this.nama = s;
        System.out.println("Nama : " + nama);
        System.out.println();
    }

    public void addFirst(int a) {
        if (isEmpty()) {
            ListNode newNode = new ListNode(a);
            firstNode = newNode;
            lastNode = newNode;
        } else {
            ListNode newNode = new ListNode(a);
            newNode.setNext(firstNode);
            firstNode = newNode;
        }
    }

    public void addLast(int a) {
        if (isEmpty()) {
            ListNode newNode = new ListNode(a);
            firstNode = newNode;
            lastNode = newNode;
        } else {
            ListNode newNode = new ListNode(a);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
    }

    public ListNode removeFirst() {
        if (!isEmpty()) {
            if (firstNode == lastNode) {
                ListNode temp = firstNode;
                firstNode = lastNode = null;
                return temp;
            } else {
                ListNode temp = firstNode;
                firstNode = firstNode.getNext();
                return temp;
            }
        }
        return null;
    }

    public ListNode removeLast() {
        if (!isEmpty()) {
            if (firstNode == lastNode) {
                ListNode temp = lastNode;
                firstNode = lastNode = null;
                return temp;
            } else {
                ListNode temp = firstNode;
                while (temp.getNext() != lastNode) {
                    temp = temp.getNext();
                }
                lastNode = temp;
                temp = temp.getNext();
                lastNode.setNext(null);
                return temp;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public String toString() {
        String x = "";
        ListNode current = firstNode;
        while (current != null) {
            x += " " + current.getData() + " ";
            current = current.getNext();
        }
        return "[" + x + "]";
    }
}
