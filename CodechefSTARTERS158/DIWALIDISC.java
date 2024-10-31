import java.util.Scanner;

public class DIWALIDISC {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;

        int rem = a-b ;
        if(rem > 0 ) System.out.println(rem);
        else System.out.println("0");

        sc.close();

    }

}
