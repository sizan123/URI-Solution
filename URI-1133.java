import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);
        int x, y;
      
        x = in.nextInt();
        y = in.nextInt();

        if (x > y) {
            for (int i = y + 1; i < x; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }

        }
    }
}
