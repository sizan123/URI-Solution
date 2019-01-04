import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        n= input.nextInt();
        
        int [] x = new int[n];
        
        for (int i = 0; i < n ; i++) {
            x[i]=input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (x[i]%2 != 0 && x[i]<0) {
                System.out.println("ODD NEGATIVE");
            }
            else if(x[i]==0){
                System.out.println("NULL");
            }
            else if(x[i]%2 != 0 && x[i]>0){
                System.out.println("ODD POSITIVE");
            }
            else if(x[i]%2 == 0 && x[i]>0){
                System.out.println("EVEN POSITIVE");
            }
            else if(x[i]%2 == 0 && x[i]<0){
                System.out.println("EVEN NEGATIVE");
            }
            
        }
        
    }
    
}
