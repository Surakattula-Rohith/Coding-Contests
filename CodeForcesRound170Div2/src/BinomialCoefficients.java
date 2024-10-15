import java.util.Scanner;

public class BinomialCoefficients {

    static final int MOD = 1000000007;
    static final int MAX_N = 100000;
    static long[][] C = new long[MAX_N + 1][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Precompute the wrong binomial coefficients
        precompute();

        // Step 2: Read the input
        int t = scanner.nextInt(); // Number of test cases
        int[] n = new int[t];
        int[] k = new int[t];

        for (int i = 0; i < t; i++) {
            n[i] = scanner.nextInt();
        }

        for (int i = 0; i < t; i++) {
            k[i] = scanner.nextInt();
        }

        // Step 3: Process each query
        for (int i = 0; i < t; i++) {
            System.out.println(C[n[i]][k[i]]);
        }

        scanner.close();
    }

    private static void precompute() {
        // Initialize C with correct sizes
        for (int n = 0; n <= MAX_N; n++) {
            C[n] = new long[n + 1];
        }

        // Precompute C[n][k] using the wrong formula
        for (int n = 0; n <= MAX_N; n++) {
            C[n][0] = 1; // C[n][0] = 1 for all n
            C[n][n] = 1; // C[n][n] = 1 for all n

            for (int k = 1; k < n; k++) {
                C[n][k] = (C[n][k - 1] + C[n - 1][k - 1]) % MOD;
            }
        }
    }
}