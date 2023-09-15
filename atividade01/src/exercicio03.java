
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomes[] = new String[5];
        for (int c = 0; c < 5; c++) {

            System.out.println("Digite  o nome " + (c + 1) + " :");
            nomes[c] = ler.nextLine();
        }
        System.out.println("lista criadar");
        System.out.println("digite o nome que voce que encontrar:");
        String nome = ler.nextLine();

        for (int c = 0; c < 5; c++) {
            if (nomes[c].equals(nome)) {
                System.out.println("o nome voi encontrando na posicao :" + c);
                break;
            } else {
                System.out.println("o nome nao foi encontrando");

            }
        }

    }
}