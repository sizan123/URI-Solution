

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        int n,j ;
        int temp;
        n= in.nextInt();
        for (int i = 1; i <= n; i++) {
            int x,y ;
            int sum = 0 ;
            x= in.nextInt();
            y= in.nextInt();
            for ( j = x,temp=0; temp < y; j++) {
                if (j % 2 != 0) {
                    sum=sum+j ;
                    temp +=1;
                }
              
            }
              System.out.println(sum);
        }
        
    }
    
}
