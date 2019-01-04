import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int x ;
        x= input.nextInt();
        
        for (int i = x; i <= x+12; i++) {
            if (i%2 !=0) {
                System.out.println(i);
            }
        }
        
    }
}
