package gcr_codebase.programming_elements.Strings;

public class NullPointerDemo {

    public static void main(String[] args) {
        generateException();
        demonstrateExceptionHandling();
    }

    public static void generateException() {
        String text = null;
        text.length();
    }

    public static void demonstrateExceptionHandling() {
        String text = null;
        try {
            text.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("Successfully caught the exception: " + e);
        }
    }
}

