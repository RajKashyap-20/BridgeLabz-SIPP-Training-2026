package Method;
public class main {
    public static void main(String[] args) {
        System.out.println("--- Testing Math Wizard Utility ---");
        System.out.println("Is 17 prime? " + MathWizard.isPrime(17));
        System.out.println("Factorial of 5 (int): " + MathWizard.factorial(5));
        System.out.println("Factorial of 5.5 (double): " + MathWizard.factorial(5.5));
        System.out.println("Fibonacci 7th number: " + MathWizard.fibonacci(7));
        System.out.println("GCD of 24 and 36: " + MathWizard.gcd(24, 36));
        System.out.println("LCM of 24 and 36: " + MathWizard.lcm(24, 36));
        System.out.println("Power 2^3: " + MathWizard.power(2, 3));

        System.out.println("\n--- Demonstrating Scope ---");
        MathWizard wizard = new MathWizard();
        wizard.demonstrateScope(5);
    }

    public static class MathWizard {

        private String instanceNotes = "Instance variable: available throughout the class.";

        public static boolean isPrime(int n) {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static long factorial(int n) {
            if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static double factorial(double n) {
            if (n < 0) throw new IllegalArgumentException("Number must be non-negative");
            double result = 1.0;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static int fibonacci(int n) {
            if (n <= 0) return 0;
            if (n == 1) return 1;
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }

        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }

        public static int lcm(int a, int b) {
            if (a == 0 || b == 0) return 0;
            return Math.abs(a * b) / gcd(a, b);
        }

        public static double power(double base, double exp) {
            return Math.pow(base, exp);
        }

        public void demonstrateScope(int paramVar) {
            int localVar = 10;

            System.out.println("Parameter variable (paramVar): " + paramVar);
            System.out.println("Local variable (localVar): " + localVar);
            System.out.println("Instance variable (instanceNotes): " + instanceNotes);
        }
    }
}
