import java.util.Arrays;
import java.util.Scanner;

public class addmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Entered array elements: " + Arrays.toString(numbers));

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}
