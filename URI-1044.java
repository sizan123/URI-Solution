import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, max, min;
        
        x= input.nextInt();
        y= input.nextInt();
        
        if (x>y) {
            max=x;
            min=y;
        }
        else if (x<y) {
            max=y;
            min=x;
        }
        else{
            max=x;
            min=y;
        }
        if(max%min ==0){
            System.out.println("Sao Multiplos");
           
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
    
}
