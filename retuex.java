public class retuex {
    public static void main(String[] args) {
        System.out.println("Before return");
        if (true) return; // exits method
        // This line won’t execute
        System.out.println("After return");
    }
}
