package gcr_codebase.programming_elements.Strings;
import java.util.Scanner;

public class LowercaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();
        String lowerText1 = text1.toLowerCase();
        String lowerText2 = text2.toLowerCase();
        boolean areEqual = lowerText1.equals(lowerText2);
        System.out.println("First string in lowercase: " + lowerText1);
        System.out.println("Second string in lowercase: " + lowerText2);
        System.out.println("Are the lowercase strings equal? " + areEqual);

        scanner.close();
    }
}
