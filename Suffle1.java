import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Shuffle1 {
    public static void main(String args[]) {
        int[] solutionArray = { 1, 2, 3, 4, 5, 6, 7 };

        shuffleArray(solutionArray);
        for (int i = 0; i < solutionArray.length; i++) {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();
    }

    static void shuffleArray(int[] ar) {

        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;

        }
    }
}