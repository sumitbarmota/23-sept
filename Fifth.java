import java.util.Scanner;

public class Main {
    // Recursive function to sum array elements
    static int sumBoxes(int[] arr, int n) {
        if (n == 0) return 0;                // Base case
        return arr[n - 1] + sumBoxes(arr, n - 1); // Add last element + sum of rest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                // Number of boxes
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();         // Coins in each box
        }
        System.out.println(sumBoxes(coins, n)); // Output total coins
    }
}
