import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PartsCore {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();

                arr.add(val);
            }

            Collections.sort(arr);

            int ans = 0 ;
            if(k == 1) ans = arr.get(n-1)+arr.get(n-1) + arr.get(0) + arr.get(n-2) ;
            else ans = arr.get(n-1)+arr.get(n-k-1) + arr.get(n-2) + arr.get(0) ;


            System.out.println(ans);


            t--;
        }
        scanner.close();
    }
}
