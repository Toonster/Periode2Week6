public class SpellingException extends RuntimeException {
    public static int teller = 0;

    public SpellingException() {
        teller++;
    }
}
