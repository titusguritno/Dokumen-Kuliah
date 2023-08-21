package Searching_Object;
/**
 *
 * @author Titus Guritno
 */
public class Game implements Comparable {
    private String nama;
    private int score;

    public Game(int score, String nama) {
        this.score = score;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String toString() {
        return "Pemain{" + "Nama = " + nama + ", Score = " + score + '}';
    }

    public int compareTo(Object o) {
        if (score == ((Game) o).getScore()) {
            return 0;
        } else if (score > ((Game) o).getScore()) {
            return 1;
        } else {
            return -1;
        }
    }
}
