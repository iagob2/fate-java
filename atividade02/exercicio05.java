package atividade02;

import java.util.Random;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale= new Random();
		int cont  =  0;
		
		int[] lista = new int[30];
		System.out.print("a lista de numeros é:");

		for(int c=0;c<30;c++) {
			lista[c] = ale.nextInt(1,100);
			System.out.print(lista[c] + " / ");

			if((lista[c] % 2 ) == 1 ) {
				cont += 1;
			}
			
		}
		
		System.out.println();
		System.out.println("nessa lista tem :" + cont+" numeros impares " );
		




	}

}
