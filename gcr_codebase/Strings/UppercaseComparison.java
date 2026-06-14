package gcr_codebase.programming_elements.Strings;

import java.util.Scanner;

public class UppercaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String text2 = scanner.nextLine();
        String upperText1 = text1.toUpperCase();
        String upperText2 = text2.toUpperCase();
        boolean areEqual = upperText1.equals(upperText2);
        System.out.println("First string in lowercase: " + upperText1);
        System.out.println("Second string in lowercase: " + upperText2);
        System.out.println("Are the lowercase strings equal? " + areEqual);
    }
}
