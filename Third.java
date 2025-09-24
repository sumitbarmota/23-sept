import java.util.Scanner;

public class Main {
    // Recursive function to find sum from 1 to n
    static int sumTreasury(int n) {
        if (n == 0) return 0;         // Base case
        return n + sumTreasury(n - 1); // Add current n and recurse
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         // Input n
        System.out.println(sumTreasury(n)); // Output sum
    }
}
