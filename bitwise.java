public class bitwise {
    public static void main(String[] args) {
        int a = 5, b = 3;  // 5 = 0101, 3 = 0011

        System.out.println("a & b = " + (a & b)); // AND
        System.out.println("a | b = " + (a | b)); // OR
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a));       // NOT
        System.out.println("a << 1 = " + (a << 1)); // Left Shift
        System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
    }
}
