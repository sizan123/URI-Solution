import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n ;
        n= input.nextInt();
        if (n==61) {
            System.out.println("Brasilia");
        }
        else if (n==71) {
            System.out.println("Salvador");
        }
        else if (n==11) {
            System.out.println("Sao Paulo");
        }
        else if (n==21) {
            System.out.println("Rio de Janeiro");
        }
        else  if (n==32) {
            System.out.println("Juiz de Fora");
        }
        else  if (n==19) {
            System.out.println("Campinas");
        }
        else if (n==27) {
            System.out.println("Vitoria");
        }
        else if (n==31) {
            System.out.println("Belo Horizonte");
        }
        else {
            System.out.println("DDD nao cadastrado");
        }
        
    }
    
}
