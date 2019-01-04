import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
       
        n = in.nextInt();

        if (n > 5 && n < 2000) {
            for (int i = 1; i <= n; i++) {
                
                if (i % 2 == 0) {
                    
                     System.out.println(i+"^2 = "+i*i);
                }
            }
        }
    }
}
