public class Stack {
    private final int MAX = 5;
    String[] stack = new String[MAX];
    private int count;

    public void push(String woord) throws IndexOutOfBoundsException {
        if (count > 4) {
            throw new IndexOutOfBoundsException("De stack is vol!");
        }
        stack[count++] = woord;
    }

    public String pop() throws IndexOutOfBoundsException {
        if (count < 1) {
            throw new IndexOutOfBoundsException("De stack is leeg!");
        }
        return stack[--count];
    }

    @Override
    public String toString() {
        StringBuilder inhoud = new StringBuilder();
        for (int i = 0; i < count; i++) {
            inhoud.append(stack[i]);
            inhoud.append(" - ");
        }
        return inhoud.toString();
    }
}
