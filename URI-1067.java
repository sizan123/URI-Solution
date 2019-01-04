import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X;
        X = input.nextInt();

        if (X >= 1 && X <= 1000) {
            for (int i = 1; i <= X; i++) {
                if (i % 2 != 0) {
                   System.out.println(i);
                }
                
            }

        }

    }

}
