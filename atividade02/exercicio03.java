package atividade02;
import java.util.Random;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale = new Random();
		float num = 0;
		int[] lista = new int[20];
		System.out.print("a lista de numero é:");
		for(int c=0 ; c <20 ; c++) {
			lista[c]= ale.nextInt(1,100);
			System.out.print(lista[c] + " / ");
            num = lista[c]+ num;
		

	}
		System.out.println();
		System.out.println("a media dos numeros é :"+ (num/ 20));

}}
