import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        n= in.nextInt();
        
        if (n<10000) {
            for (int i = 1; i < 10000; i++) {
                if (i%n == 2) {
                    System.out.println(i);
                    
                }
                
            }
        }
        
    }
    
}
