import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Geef een getal van 1 tot en met 10: ");
            int getal = input.nextInt();
            try {
                if (getal < 1 || getal > 10) {
                    throw new InputMismatchException(getal + " is geen getal van 1 tot en met 10");
                }
                isRunning = false;
                System.out.println(getal + " is een goed getal!");
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
