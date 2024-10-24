import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ABNOMAT {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            scanner.nextLine();

            String A = scanner.nextLine();
            String B = scanner.nextLine();

            ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(26, 1));


            for (int i = 0; i < A.length(); i++) {
                int idx = A.charAt(i) - 'a';
                int val = list.get(idx);
                list.set(idx, val - 1);
            }

            for (int i = 0; i < B.length(); i++) {
                int idx = B.charAt(i) - 'a';
                int val = list.get(idx);
                list.set(idx, val - 1);
            }

            int ans = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > 0) ans++;
            }

            // Print result
            if (ans > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            t--; // Move to the next test case
        }
        scanner.close();
    }
}
