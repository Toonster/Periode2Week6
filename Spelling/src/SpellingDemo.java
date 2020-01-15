import java.util.InputMismatchException;
import java.util.Scanner;

public class SpellingDemo {
    private static final String[] TEST_WOORDEN =
            {"onmiddellijk", "ogenblikkelijk"};
    public static void main(String[] args) {
        boolean fout = true;
        do {
            System.out.print("Geef een synoniem voor 'direct' in 'o...k': ");
            Scanner scanner = new Scanner(System.in);
            String woord = scanner.nextLine();
            try {
                if (!woord.equalsIgnoreCase(TEST_WOORDEN[0]) && !woord.equalsIgnoreCase(TEST_WOORDEN[1])) {
                    throw new SpellingException();
                }
                fout = false;
                System.out.println("Correct!");
            } catch (SpellingException e) {
                System.out.println("Woord: o...k -> foutieve poging nr " + SpellingException.teller + " (" + woord + ")");
            }
        } while (fout);
    }
}
