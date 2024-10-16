import java.util.ArrayList;
import java.util.Scanner;

public class CountTrip {
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
            int ans = 0 ;

            for(int i = 0 ; i < n ; i++){
                for(int j = i+1 ; j < n ; j++){
                    for(int k = j+1 ; k < n ; k++ ){
                        if(Math.abs(arr.get(i) - arr.get(k)) == Math.abs(i-j)+Math.abs(j-k)){
                            ans++;
                        }
                    }
                }
            }

            System.out.println(ans);


            t--;
        }
        scanner.close();
    }
}
