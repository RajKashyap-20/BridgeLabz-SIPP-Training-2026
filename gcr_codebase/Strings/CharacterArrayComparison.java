package gcr_codebase.programming_elements.Strings;

import java.util.Scanner;

public class CharacterArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.next();

        char[] customArray = getCharsCustom(userInput);

        char[] builtInArray = userInput.toCharArray();

        boolean areEqual = compareCharacterArrays(customArray, builtInArray);

        System.out.println(areEqual);

        scanner.close();
    }

    public static char[] getCharsCustom(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharacterArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
}
