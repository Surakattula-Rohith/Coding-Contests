import java.util.Scanner;

public class SweetsShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt() ;

        System.out.println((int)((x-n*10)/20) );
    }
}
