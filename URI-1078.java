import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n;
        int multi = 1;
        n= input.nextInt();
        for (int i = 1; i <= 10; i++) {
            
            multi = n * i ;
            
            System.out.println(i+ " x " +n+ " = " +multi);
        }
    }
}
