import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int even = 0, odd = 0, pos = 0, neg = 0;
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) {

            if (num[i] % 2 == 0) {
                even++;
            }
       
        }
        System.out.println(even + " valores pares");
       
    }
}

