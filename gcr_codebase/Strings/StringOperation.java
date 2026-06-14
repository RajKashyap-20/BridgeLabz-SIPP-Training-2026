package gcr_codebase.Strings;
import java.util.*;
public class StringOperation {
    public static String reverseMessage(String message) {
        if (message == null) {
            return null;
        }
        return new StringBuilder(message).reverse().toString();
    }

    public static boolean isPalindrome(String message) {
        if (message == null) {
            return false;
        }
        String clean = message.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static int[] countVowelsAndConsonants(String message) {
        int[] counts = new int[2];
        if (message == null) {
            return counts;
        }
        String vowelsList = "aeiouAEIOU";
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsList.indexOf(c) != -1) {
                    counts[0]++;
                } else {
                    counts[1]++;
                }
            }
        }
        return counts;
    }

    public static boolean areAnagrams(String intercept1, String intercept2) {
        if (intercept1 == null || intercept2 == null) {
            return false;
        }
        String clean1 = intercept1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String clean2 = intercept2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (clean1.length() != clean2.length()) {
            return false;
        }
        char[] array1 = clean1.toCharArray();
        char[] array2 = clean2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1, array2);
    }

    public static Character findFirstNonRepeating(String log) {
        if (log == null || log.isEmpty()) {
            return null;
        }
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : log.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String secret = "Radar";
        String log = "aacbdebff";
        String int1 = "Listen";
        String int2 = "Silent";

        System.out.println("Reversed: " + reverseMessage(secret));
        System.out.println("Is Palindrome: " + isPalindrome(secret));

        int[] counts = countVowelsAndConsonants(secret);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);

        System.out.println("Are Anagrams: " + areAnagrams(int1, int2));
        System.out.println("First Unique Log: " + findFirstNonRepeating(log));
    }
}
