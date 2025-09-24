import java.util.Scanner;

public class Main {
    
    static void printBeats(int i, int n) {
        if (i > n) return;           
        System.out.print(i + " ");   
        printBeats(i + 1, n);        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        printBeats(1, n);           
    }
}
