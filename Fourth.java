import java.util.Scanner;

public class Main {
    // Recursive function to reverse a string
    static String reverseMirror(String s) {
        if (s.isEmpty()) return "";                 // Base case
        return reverseMirror(s.substring(1)) + s.charAt(0); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();                   // Input string
        System.out.println(reverseMirror(s));       // Output reversed string
    }
}
