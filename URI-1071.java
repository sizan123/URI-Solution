import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int X, Y, max, min, sum = 0;

        X = input.nextInt();
        Y = input.nextInt();
        if (X>Y) {
            max = X;
            min = Y;
        }
        else if(X<Y){
            max = Y;
            min = X ;
        }
        else{
            max=X;
            min= Y;
        }
        for (int i = min+1; i < max; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
