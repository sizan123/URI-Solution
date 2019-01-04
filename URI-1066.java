import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int even = 0, odd = 0, pos = 0, neg = 0;
        int[] num = new int[5];
        
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {

            if(num[i] % 2 == 0) {
                even++;
            }
            if(num[i] % 2 != 0) {
                odd++;
            }
            if(num[i] > 0) {
                pos++;
            }
            if(num[i] < 0) {
                neg++;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)"); 
    }
}
