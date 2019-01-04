import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n ;
        int first=0 ,sec=1 , fibo =0 ;
        n = in.nextInt();
        System.out.print(first+" "+sec);
        for (int i = 3; i <= n; i++) {
            fibo = first+sec;
            System.out.print(" "+fibo);
            first= sec;
            sec =fibo;
        }
        System.out.println();
        
    }
    
}
