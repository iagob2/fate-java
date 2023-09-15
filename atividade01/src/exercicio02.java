import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        int somar = 0;
        int ct = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero:  ");
        int num = ler.nextInt();

        for (int c = 1; c <= 1000; c++) {

            if (c % 2 == 1) {

                somar = +c;
                ct++;
                if (ct == num) {
                    break;
                }

            }
        }

        System.out.println("foram " + num + "numeros impares e a somar deles e :" + somar);

    }
}