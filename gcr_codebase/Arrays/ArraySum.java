package gcr_codebase.programming_elements.Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop):");

        while (true) {
            if (index == 10) {
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double entry = scanner.nextDouble();

            if (entry <= 0) {
                break;
            }

            numbers[index] = entry;
            index++;
        }

        System.out.println("\nStored numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal value: " + total);

        scanner.close();
    }
}

