import java.util.ArrayList;
import java.util.Scanner;

public class EvenHate {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int odd = 0 , even = 0 ;
            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                if(val%2 == 0) even++ ;
                else odd++ ;
                arr.add(val);
            }
            int ans = 0 ;
            if(odd == 0 ) ans = odd ;
            else{
                ans+= 1 ;
                int odd_pairs = (odd-1)/2 ;
                ans += odd_pairs ;
                ans += even ;

            }

            System.out.println(ans);


            t--;
        }
        scanner.close();
    }

}
