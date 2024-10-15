import java.util.Scanner;

public class TwoScreens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine();
            String t = scanner.nextLine();
            int result = minSeconds(s, t);
            System.out.println(result);
        }

    }

    public static int minSeconds(String s, String t) {
        int n = s.length();
        int m = t.length();
        int maxLength = 0;

        // Find the length of the longest common prefix
        for (int i = 0; i < Math.min(n, m); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                maxLength++;
            } else {
                break;
            }
        }

        // If there is no common prefix, return the sum of lengths
        if (maxLength == 0) {
            return n + m;
        }

        // Return the time required for the operations
        return n + m - maxLength + 1; // Add 1 for the copy operation
    }
}