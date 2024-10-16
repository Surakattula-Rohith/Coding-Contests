import java.util.ArrayList;
import java.util.Scanner;

    public class LongQueue {
        public static void main(String[] args) throws java.lang.Exception {
            Scanner scanner = new Scanner(System.in);

            int t = scanner.nextInt();
            while (t > 0) {
                int n = scanner.nextInt();
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int val = scanner.nextInt();
                    arr.add(val);
                }

                int sushilWealth = arr.get(n - 1);

                int position = n - 1;

                while (position > 0) {

                    if (arr.get(position - 1) <= sushilWealth / 2) {
                        position--;
                    } else {
                        break;
                    }
                }

                System.out.println(position + 1);

                t--;
            }
            scanner.close();
        }
}
