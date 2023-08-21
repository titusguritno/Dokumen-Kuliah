package TugasSDL_205314110.Generic;
/**
 *
 * @author Titus Guritno
 */
public class Main {
    public static void main(String[] args) {
        Stack<Mahasiswa> stack = new Stack<Mahasiswa>();
    
        stack.push(new Mahasiswa("Titus", 205314110, "Informatika", "Kembayan"));
        stack.cetak();
    }
}
