package MODUL10.Static;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Queue antrian = new Queue(7);
        antrian.enqueue(26);
        antrian.cetak();
        antrian.enqueue(15);
        antrian.cetak();
        antrian.enqueue(8);
        antrian.cetak();
        antrian.enqueue(14);
        antrian.cetak();
        
        System.out.println("Antrian yang dikeluarkan " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Antrian yang dikeluarkan " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Antrian yang dikeluarkan " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Antrian yang dikeluarkan " + antrian.dequeue()); 
        antrian.cetak();
        System.out.println("Antrian yang dikeluarkan " + antrian.dequeue()); 
        antrian.cetak();
        
    }
}
