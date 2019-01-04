import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int pass;
        do {

            pass = in.nextInt();

            if (pass != 2002) {
                System.out.println("Senha Invalida");
            } else if (pass == 2002) {
                System.out.println("Acesso Permitido");
            }

        } while (pass != 2002);

    }

}

