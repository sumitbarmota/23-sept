import java.util.Scanner;

public class Main {
    // Recursive function to find Fibonacci number at month n
    static int rabbitFamily(int n) {
        if (n == 1 || n == 2) return 1;               // Base cases
        return rabbitFamily(n - 1) + rabbitFamily(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                        // Input month
        System.out.println(rabbitFamily(n));         // Output number of rabbits
    }
}
