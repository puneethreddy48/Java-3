public class predence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;    // Multiplication has higher precedence than addition
        System.out.println("10 + 5 * 2 = " + result);

        int result2 = (10 + 5) * 2; // Parentheses override precedence
        System.out.println("(10 + 5) * 2 = " + result2);
    }
}
