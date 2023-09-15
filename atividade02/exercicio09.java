package atividade02;

import java.util.Random;
import java.util.Scanner ;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale= new Random();
		Scanner ler = new Scanner(System.in);
		 int v = 0; 
		
		int[] lista = new int[25];
		

		for(int c=0;c<25;c++) {
			lista[c] = ale.nextInt(1,100);
		}
		
		System.out.println("digite um numero para ver se ele está na lista:");
		int num = ler.nextInt();
		
		for(int c = 0; c < lista.length;c++) {
			if(lista[c] == num ) {
				System.out.println("o seu numero está na lista ele é o " + num);
				v = 1;
				break ;
				
			}
		}
		System.out.print("a lista de numeros é:");
		for(int c=0;c<25;c++) {
			System.out.print(lista[c] + " / ");
		}
		System.out.println();
		if(v == 0 ) {
		System.out.println("O seu numero não está na lista");}
			
	

	}

}
