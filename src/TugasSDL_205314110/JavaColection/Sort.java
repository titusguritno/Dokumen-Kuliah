package TugasSDL_205314110.JavaColection;
import java.util.Arrays;
import java.util.LinkedList;
/**
 *
 * @author Titus Guritno
 */
public class Sort {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(5);
        
        Object[] array = list.toArray();
        
        Arrays.sort(array);
        
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
