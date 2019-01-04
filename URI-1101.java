import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int m, n;
     

        while (((m = in.nextInt()) > 0) && ((n = in.nextInt())>0))  {
            int sum = 0;
               int max, min ;

            if (m > n) {
                max = m;
                min = n;
            } else if (m < n) {
                max = n;
                min = m;
            } else {
                max = m;
                min = n;
            }

            for (int i = min; i <= max; i++) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            System.out.println("Sum=" + sum);

        }
    }

}


