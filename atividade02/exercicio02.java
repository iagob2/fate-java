package atividade02;
import java.util.Random;
import java.util.Scanner;
public class exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale = new Random();
		Scanner ler = new Scanner(System.in);
		int pen = ale.nextInt(1,100);
		System.out.println("pensei em um numero ente 1 � 100 tente adivinha: ");
		System.out.print("digite que numero �: ");
		int num = ler.nextInt();
		
		while(num != pen ) {
			
		if (num > pen ) {
			System.out.println("o numero que voc� digite � maior que o meu, tenter novamente: ");
			num = ler.nextInt();
		}else {
			System.out.println("o numero que voc� digite � menor que o meu, tenter novamente: ");
			num = ler.nextInt();
		}
        }
		System.out.println("voc� acentou!!! meu numero e:"+pen);
		
	}

}
