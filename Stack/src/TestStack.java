public class TestStack {
    public static void main(String[] args) {
        String[] alfabet = {"alfa", "bravo", "charlie",
                "delta", "echo", "foxtrot"};
        Stack stack = new Stack();
        try {
            for (String string : alfabet) {
                stack.push(string);
                System.out.println("Inhoud: " + stack);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nStack leegmaken.");
        try {
            while (true) {
                String string = stack.pop();
                System.out.println("Afgehaald: " + string);
                System.out.println("Inhoud: " + stack);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
