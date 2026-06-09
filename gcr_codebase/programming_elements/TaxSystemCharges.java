package gcr_codebase.programming_elements;
import java.util.*;

public class TaxSystemCharges {
    public static double calculateTaxAmount(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }


    public static String getTaxBracket(double income) {
        if (income < 10000) {
            return "Low (<10K)";
        } else if (income <= 50000) {
            return "Medium (10K–50K)";
        } else {
            return "High (>50K)";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Single Citizen Check ---");
        System.out.print("Enter citizen's income: ");

        if (scanner.hasNextDouble()) {
            double singleIncome = scanner.nextDouble();
            String bracket = getTaxBracket(singleIncome);
            double taxOwed = calculateTaxAmount(singleIncome);

            System.out.println("Tax Bracket: " + bracket);
            System.out.printf("Tax Amount Owed: $%,.2f\n\n", taxOwed);
        } else {
            System.out.println("Invalid input. Please restart and enter a numerical value.\n");
            scanner.next(); // Clear invalid input
        }

        // --- Part 2: Extension (Loop over 10 citizens) ---
        System.out.println("--- 10 Citizens Tally ---");

        double[] citizenIncomes = {8500, 12000, 45000, 55000, 3200, 95000, 22000, 60000, 15000, 8000};
        double totalTaxCollected = 0.0;
        System.out.printf("%-10s | %-12s | %-18s | %-10s\n", "Citizen", "Income", "Tax Bracket", "Tax Owed");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < citizenIncomes.length; i++) {
            double income = citizenIncomes[i];
            String bracket = getTaxBracket(income);
            double taxOwed = calculateTaxAmount(income);

            totalTaxCollected += taxOwed;
            System.out.printf("Citizen %-2d | $%-10.2f | %-18s | $%-10.2f\n", (i + 1), income, bracket, taxOwed);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("Total Tax Collected by the Kingdom: $%,.2f\n", totalTaxCollected);

        scanner.close();
    }
}
