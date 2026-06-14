package gcr_codebase.programming_elements.Strings;

import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.next();

        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();

        System.out.print("Enter the end index (exclusive): ");
        int endIndex = scanner.nextInt();
        if (startIndex < 0 || endIndex > mainString.length() || startIndex > endIndex) {
            System.out.println("Error: Invalid start or end index.");
            scanner.close();
            return;
        }
        String customSub = getSubstringUsingCharAt(mainString, startIndex, endIndex);
        String builtInSub = mainString.substring(startIndex, endIndex);
        System.out.println("\n--- Results ---");
        System.out.println("Substring using charAt(): " + customSub);
        System.out.println("Substring using built-in method: " + builtInSub);

        boolean areEqual = compareStringsUsingCharAt(customSub, builtInSub);
        System.out.println("Are the two substrings equal? " + areEqual);

        scanner.close();
    }

    public static String getSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
