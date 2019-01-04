import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x, y;

        do {

            x = in.nextInt();
            y = in.nextInt();
            if (x > y) {
                System.out.println("Decrescente");

            } else if (x < y) {
                System.out.println("Crescente");
            }

        } while (x != y);

    }

}
