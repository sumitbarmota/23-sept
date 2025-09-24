import java.util.Scanner;

public class Main {
    // Recursive function to calculate factorial
    static int factorialLock(int n) {
        if (n == 1) return 1;             // Base case
        return n * factorialLock(n - 1);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             // Input n
        System.out.println(factorialLock(n)); // Output factorial
    }
}
