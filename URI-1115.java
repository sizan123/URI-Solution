import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        float x,y ;
        while(((x=in.nextFloat()) != 0) && ((y= in.nextFloat())!=0) ){
            if (x>0 && y>0) {
                System.out.println("primeiro");
            }
            else if (x<0 && y>0) {
                System.out.println("segundo");
            }
            else if (x<0 && y<0) {
                System.out.println("terceiro");
            }
            else if (x>0 && y<0) {
                System.out.println("quarto");
            }
        }
        
    }
    
}
