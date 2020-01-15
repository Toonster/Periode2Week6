public class Bewerkingen {
    private int getalEen;
    private int getGetalTwee;
    int[] lijst;

    public Bewerkingen(int getalEen, int getGetalTwee) {
        this.getalEen = getalEen;
        this.getGetalTwee = getGetalTwee;
    }

    public void doeBewerkingen() throws ArithmeticException {
        lijst = new int[4];
        lijst[0] = getalEen + getGetalTwee;
        lijst[1] = getalEen - getGetalTwee;
        lijst[2] = getalEen * getGetalTwee;
        lijst[3] = getalEen / getGetalTwee;
    }

    public void toonResultaat() {
        System.out.printf("Som:             %d\n", lijst[0]);
        System.out.printf("Verschil:        %d\n", lijst[1]);
        System.out.printf("Product:         %d\n", lijst[2]);
        System.out.printf("Quotient:        %d\n", lijst[3]);
    }
}
