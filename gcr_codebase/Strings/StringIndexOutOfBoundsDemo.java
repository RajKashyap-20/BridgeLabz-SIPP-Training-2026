package gcr_codebase.programming_elements.Strings;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        generateException(userInput);
        handleException(userInput);
        scanner.close();
    }
    public static void generateException(String text) {
        int invalidIndex = text.length() + 5;
        text.charAt(invalidIndex);
    }
    public static void handleException(String text) {
        int invalidIndex = text.length() + 5;
        try {
            text.charAt(invalidIndex);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Successfully caught the exception: " + e);
        }
    }
}
