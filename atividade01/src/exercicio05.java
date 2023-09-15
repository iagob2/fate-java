import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("nome do aluno:");
        String nome = ler.nextLine();

        System.out.println("quantas disciplinas: ");
        int qdisc = ler.nextInt();

        System.out.println("qual e a media de aprovacao: ");
        int med = ler.nextInt();

        float[][] tab = new float[qdisc][4];
        String[] nomesD = new String[qdisc];

        float somar = 0;

        for (int l = 0; l < qdisc; l++) {

            System.out.println("digite o nome da disciplina:");
            nomesD[l] = ler.nextLine();

            for (int c = 0; c < 4; c++) {

                switch (c) {

                    case 0:
                        System.out.println("digite a nota da p1:");
                        tab[l][c] = ler.nextInt();
                        somar += tab[l][c];
                        break;
                    case 1:
                        System.out.println("digite a nota da p2:");
                        tab[l][c] = ler.nextInt();
                        somar += tab[l][c];
                        break;
                    case 2:
                        System.out.println("digite a nota do trabalho:");
                        tab[l][c] = ler.nextInt();
                        somar += tab[l][c];
                        break;
                    case 3:
                        tab[l][c] = somar / 3;
                        somar = 0;
                        break;
                }

            }
        }

        System.out.println("Boletim do aluno" + nome);

        for (int l = 0; l < qdisc; l++) {
            System.out.println("disciplina:" + nomesD[l]);

            for (int c = 0; c < 4; c++) {
                System.out.println(tab[l][c]);
                if (c == 3) {
                    System.out.println("sua media " + tab[l][c]);

                    if (tab[l][c] >= med) {
                        System.out.println("Aprovado");
                    } else {
                        System.out.println("Reprovado");

                    }
                }

            }
        }

    }

}
