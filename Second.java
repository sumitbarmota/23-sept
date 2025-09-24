import java.util.Scanner;

public class Main {
    // Recursive function to print from n to 1
    static void printEcho(int n) {
        if (n < 1) return;           // Base case
        System.out.print(n + " ");   // Print current number
        printEcho(n - 1);            // Recursive call with n-1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        // Input n
        printEcho(n);                // Start from n
    }
}
