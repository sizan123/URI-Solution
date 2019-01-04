import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N;
        int start, end;
        N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int sum = 0;
            start = in.nextInt();
            end = in.nextInt();

            if (start > end) {
                for (int j = start - 1; j > end; j--) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
            } else if (start < end) {
                for (int j = start + 1; j < end; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
            } else {
                sum = 0;
            }
            System.out.println(sum);

        }

    }

}

