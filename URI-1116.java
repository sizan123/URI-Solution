import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n ; 
        double x ,y ;
        n= in.nextInt();
        for (int i = 0; i <n; i++) {
            double res ;
            x = in.nextDouble();
            y = in.nextDouble();
            
            if (x== 0) {
                System.out.println("0.0");
            }
            else if (y ==0) {
                System.out.println("divisao impossivel");
            }
             else   
            {
                System.out.println(x/y);
            }
        }
        
    }
    
}
