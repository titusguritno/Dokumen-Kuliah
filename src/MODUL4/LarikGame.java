package Searching_Object;
/**
 *
 * @author Titus Guritno
 */
public class LarikGame {
    public static void cetak(Object[] q) {
        for (int i = 0; i < q.length; i++) {
            System.out.println("Pada Index ke-" + i + " : " + q[i]);
        }
    }

    public static int sequentialObject(Game[] p, Game key) {
        for (int i = 0; i < p.length; i++) {
            if (((Comparable) p[i]).compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryObject(Game[] p, Game key) {
        int first = 0;
        int last = p.length;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (((Comparable) p[mid]).compareTo(key) == 0) {
                return mid;
            } else {
                if (((Comparable) p[mid]).compareTo(key) == 1) {
                    last = (mid - 1);
                } else {
                    first = (mid + 1);
                }
            }
        }
        return -1;
    }

    public static int interpolationObject(Game[] p, Game key) {
        int first = 0;
        int last = p.length - 1;
        int mid = 0;
        while (first <= last) {
            mid = first + ((((Game) key).getScore()
                    - ((Game) p[first]).getScore()) * (last - first))
                    / (((Game) p[last]).getScore()
                    - ((Game) p[first]).getScore());

            if (((Comparable) p[mid]).compareTo(key) == 0) {
                return mid;
            } else if (((Comparable) p[mid]).compareTo(key) > 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

}
