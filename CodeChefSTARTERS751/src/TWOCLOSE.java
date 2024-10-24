import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TWOCLOSE {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt() ;
            int sum = 0 ;
            ArrayList<Integer> list = new ArrayList<>() ;
            n = n+1 ;
            for(int i = 0 ; i < n ; i++){
                int val = scanner.nextInt(); ;
                list.add(val) ;
                sum += val ;

            }

            Collections.sort(list);

            int infaltion_value = list.get(n-1); ;

            for(int i= 0 ; i < n-1 ; i++){
                if(2*list.get(i) < list.get(i+1)){
                    infaltion_value = list.get(i) ;
                    break;
                }
            }

            sum -= infaltion_value ;
            System.out.println(sum);

            t-- ;
        }
        scanner.close();
    }
}
