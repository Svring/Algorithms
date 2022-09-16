import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int total = 0;
        String champion = "";
        while (!StdIn.isEmpty()) {
            total += 1;
            String word = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / total)) {
                champion = word;
            }
        }
        StdOut.println(champion);
    }
}
