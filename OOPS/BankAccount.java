package gcr_codebase.OOPS;

// Everything is inside one file now.
// Only the class containing the main method is marked as public.

class BankAccounts {
    // 1. Static field (Shared by all accounts)
    public static int totalAccountsCreated = 0;

    // 2. Instance fields (Unique to each account)
    public String accountNumber;
    public String holder;
    public double balance;

    // 3. Constructor
    public BankAccounts(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;

        // Increment the shared global counter
        totalAccountsCreated++;
    }

    // 4. Deposit Method
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println(this.holder + " deposited $" + amount);
    }

    // 5. Withdraw Method with Overdraft Check
    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            System.out.println(this.holder + " withdrew $" + amount);
        } else {
            System.out.println("Error: " + this.holder + " has insufficient funds for $" + amount);
        }
    }

    // 6. Print Statement Method
    public void getStatement() {
        System.out.println("Account: " + this.accountNumber + " | Holder: " + this.holder + " | Balance: $" + this.balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Create 3 separate bank accounts
        BankAccounts  acc1 = new BankAccounts("101", "Alice", 1000.0);
        BankAccounts acc2 = new BankAccounts("102", "Bob", 500.0);
        BankAccounts acc3 = new BankAccounts("103", "Charlie", 100.0);

        System.out.println("--- Starting Transactions ---");

        // 5 Transactions for Alice
        acc1.deposit(100);
        acc1.withdraw(50);
        acc1.deposit(200);
        acc1.withdraw(300);
        acc1.withdraw(2000); // Will show error (Overdraft)

        System.out.println();



        // 5 Transactions for Charlie
        acc3.withdraw(20);
        acc3.withdraw(200); // Will show error (Overdraft)
        acc3.deposit(500);
        acc3.withdraw(50);
        acc3.deposit(30);

        System.out.println("\n--- Final Statements ---");
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Access static data directly using the Class name
        System.out.println("\nTotal accounts created globally: " + BankAccounts.totalAccountsCreated);
    }
}

