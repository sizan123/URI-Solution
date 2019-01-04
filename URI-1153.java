import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x;
        int factor = 1;
        x = in.nextInt();
        for (int i = x; i >= 1; i--) {
            factor = factor * i;
        }
        System.out.println(factor);

    }

}
