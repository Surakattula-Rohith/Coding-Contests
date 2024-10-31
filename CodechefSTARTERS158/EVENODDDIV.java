import java.util.Scanner;

public class EVENODDDIV {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        while(t > 0){

            int n = sc.nextInt() ;
            int even = 0 , odd = 0 ;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if(i % 2 == 0) even++ ;
                    else odd++ ;
                    if (i != n / i) {
                        int temp = n/i ;
                        if(temp % 2 == 0) even++ ;
                        else odd++ ;
                    }
                }
            }

            if(even > odd) System.out.println("1");
            else if(even<odd) System.out.println("-1");
            else System.out.println("0") ;



            t-- ;
        }
    }
}
