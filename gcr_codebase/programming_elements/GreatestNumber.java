package gcr_codebase.programming_elements;

public class GreatestNumber {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        int greatest;

        if (a >= b && a >= c) {
            greatest = a;
        } else if (b >= a && b >= c) {
            greatest = b;
        } else {
            greatest = c;
        }

        System.out.println("The greatest number among " + a + ", " + b + ", and " + c + " is: " + greatest);
    }
}