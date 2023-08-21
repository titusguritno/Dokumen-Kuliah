package Modul7;

/**
 *
 * @author Titus Guritno
 */
public class Testing {
    public static void main(String[] args) {
        LingkedList list = new LingkedList("Titus Guritno");
		list.addFirst(8);
		list.addFirst(15);
		list.addLast(26);
		list.addLast(14);
		list.removeLast();
		list.removeLast();
		list.removeFirst();
		list.removeFirst();
		
		System.out.println(list.toString());
    }
}
