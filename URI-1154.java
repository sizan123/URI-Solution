import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x;
        int age = 0;
        int num = 0;
        float avg;
        int i = 1;
        while ((x = in.nextInt()) >= 0) {

            age += x;
            num += i;
        }
        avg = (float) ((float) age / num);
        System.out.printf("%.2f\n", avg);

    }

}
