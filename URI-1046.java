import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int start, end, temp, time;

        start = input.nextInt();
        end = input.nextInt();

        if (start > 12) {
            temp = 24 - start;
            time = temp + end;
            System.out.println("O JOGO DUROU " + time + " HORA(S)");
        } 
         else if (start==0) {
            time = start+24;
            System.out.println("O JOGO DUROU " + time + " HORA(S)");
        }
        else if (start < 12 && start!=0) {
            time = end - start;
            System.out.println("O JOGO DUROU " + time + " HORA(S)");
        }
       

    }

}
