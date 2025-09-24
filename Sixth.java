import java.util.Scanner;

public class Main {
    // Recursive function to count ways
    static int climbWays(int n) {
        if (n == 0) return 1;    // 1 way to stay at ground
        if (n == 1) return 1;    // 1 way to climb one step
        return climbWays(n - 1) + climbWays(n - 2); // Recurrence
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // Input n
        System.out.println(climbWays(n)); // Output number of ways
    }
}
