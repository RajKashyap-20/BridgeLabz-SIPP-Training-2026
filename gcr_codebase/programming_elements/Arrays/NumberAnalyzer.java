package gcr_codebase.programming_elements.Arrays;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        getUserInput(numbers);
        analyzeAndCompare(numbers);
    }

    public static void getUserInput(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
    }

    public static void analyzeAndCompare(int[] arr) {
        System.out.println("\n--- Results ---");
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            System.out.print("Number " + num + " is: ");
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        int first = arr[0];
        int last = arr[arr.length - 1];
        System.out.println("\nFirst element: " + first);
        System.out.println("Last element: " + last);
        if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else if (first < last) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element and the last element are equal.");
        }
    }
}

