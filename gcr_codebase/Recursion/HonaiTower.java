package gcr_codebase.Recursion;

import java.util.Scanner;

public class HonaiTower {
    public static void h(int n, char s, char d, char a) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + s + " to " + d);
            return;
        }

        h(n - 1, s, a, d);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        h(n - 1, a, d, s);
    }

    public static void main(String[] args) {
        int n = 3;
        h(n, 'A', 'C', 'B');
    }

}
