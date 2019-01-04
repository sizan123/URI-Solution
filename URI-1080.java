import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] num = new int[100];
        int pos=0 ;
        
        for ( int i = 0; i < 100; i++) {
            num[i]= in.nextInt();
            
        }
        int max  =num [0]  ;
        for (int i = 0; i <100; i++) {
            if (max<num[i]) {
                max = num[i];
                pos = i+1 ;
            }
        }
        System.out.println(max);
        System.out.println(pos);
    }
}
