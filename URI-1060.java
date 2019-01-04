import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int k =0;
        
        double [] number = new double[6] ;
        for (int i = 0; i < 6; i++) {
            number[i]= input.nextDouble();
            
        }
        for (int i = 0; i < 6; i++) {
            
            if (number[i]>0) {
                k++;
            }
        }
        System.out.println(k+" valores positivos");
    }
    
}
