import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class PanagramOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the input string to lowercase.
        input = input.toLowerCase();

        // Create a set of the letters in the input string.
        Set<Character> letters = new HashSet<>();
        for (char c : input.toCharArray()) {
            letters.add(c);
        }

        // Create a set of all the letters in the alphabet.
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }

        // Check if the set of letters in the input string is equal to the set of all the letters in the alphabet.
        boolean isPangram = letters.equals(alphabet);

        // Print the result.
        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }
    }
}
