package proyekSdl;
public class LinkedList<E> {
    private ListNode head;
    private int size;
    
    public LinkedList(){
        head = new ListNode();
        head.next = head;
        head.prev = head;
        size = 0;
    }
    
    public void addBefore(E element, ListNode node){
        ListNode baru = new ListNode(element);
        node.prev.next = baru;
        baru.setPrev(node.getPrev());
        baru.setNext(node);
        node.setPrev(baru);
        size++;
    }
    
    public E remove(ListNode node){
        ListNode kiri = node.prev;
        ListNode kanan = node.next;
        kiri.next = kanan;
        kanan.prev = kiri;
        size--;
        return (E) node.element;
    }
    
    public void addFirst(E element){
        addBefore(element, head.next);
    }
    
    public void addLast(E element){
        addBefore(element, head);
    }
    
    public E removeFirst(){
        return remove(head.next);
    }
    
    public Object removeLast(){
        return remove(head.prev);
    }
    
    public ListNode search(Object node){
        ListNode bantu = head.next;
        while(bantu != head){
            if(node == bantu.element)
                return bantu;
            bantu = bantu.next;
        }
        return null;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        if(head == head.next)
            return true;
        else
            return false;
    }
    
    public void cetak(){
        ListNode bantu = head.next;
        while(bantu != head){
            System.out.print(bantu.getElement()+"");
            bantu = bantu.next;
        }
        System.out.println("");
    }
}
