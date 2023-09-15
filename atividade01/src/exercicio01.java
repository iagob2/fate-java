import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade : ");
        int idade = ler.nextInt();

        if (idade < 18) {
            System.out.println(" voce tem:  " + idade + " anos  e   de menor ");
        }

        else if (idade >= 18 && idade < 60) {
            System.out.println("voce tem:  " + idade + " anos e ja e adulto");
        } else if (idade >= 60) {
            System.out.println("voce tem:  " + idade + " anos e ja e  um idoso ");
        }

    }

}
