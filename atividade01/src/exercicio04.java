import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("digite a senha secreta:");
        String senha = ler.nextLine();

        while (senha !="iago123") {
            System.out.println("senha incorreta , tente de novo");
        }

        System.out.println("senha corretar ");

    }
}
