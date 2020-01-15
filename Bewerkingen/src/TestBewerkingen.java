import java.util.InputMismatchException;
import java.util.Scanner;

public class TestBewerkingen {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Geef 2 gehele getallen: ");
                int getalEen = input.nextInt();
                int getalTwee = input.nextInt();
                Bewerkingen bewerkingen = new Bewerkingen(getalEen, getalTwee);
                bewerkingen.toonResultaat();
            } catch (InputMismatchException e) {
                System.out.println("Je moet 2 gehele getallen ingeven!");
            } catch (ArithmeticException e) {
                System.out.println("Het tweede getal mag niet 0 zijn!");
            }
        } while (isRunning);
    }
}
