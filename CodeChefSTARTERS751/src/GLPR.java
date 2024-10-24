import java.util.Scanner;

public class GLPR {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if( 2*x >= y) System.out.println("METAL");
        else System.out.println("PLASTIC");

        scanner.close();
    }
}
