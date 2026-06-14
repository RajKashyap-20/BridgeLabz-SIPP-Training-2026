package gcr_codebase.programming_elements.Strings;
import java.util.Scanner;
public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Array created with size " + size + " (Valid indices: 0 to " + (size - 1) + ").");
        generateException(numbers);

        handleException(numbers);

        scanner.close();
    }
    public static void generateException(int[] array) {
        int invalidIndex = array.length + 5;
        System.out.println("Attempting to access index " + invalidIndex + "...");
        int value = array[invalidIndex];
    }
    public static void handleException(int[] array) {
        int invalidIndex = array.length + 5;
        try {
            System.out.println("Attempting to handle access at index " + invalidIndex + "...");
            int value = array[invalidIndex];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Successfully caught the exception: " + e);
        }
    }
}
