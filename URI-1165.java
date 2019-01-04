import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n, x,j ;

        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            x = in.nextInt();
            boolean sizan = true ;
            for ( j = 2; j < x; j++) {
                if (x % j == 0) {
                      sizan = false;
                }
            }
            if (sizan) {
                System.out.println(x + " eh primo");
            } else  {
                System.out.println(x + " nao eh primo");
            }

        }
    }

}
