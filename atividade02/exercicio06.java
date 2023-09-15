package atividade02;

import java.util.Random;

public class exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale= new Random();
	
		int[] lista = new int[10];
		System.out.print("a lista de numeros é:");

		for(int c=0;c<10;c++) {
			lista[c] = ale.nextInt(1,100);
			System.out.print(lista[c] + " / ");}
			
		System.out.println();
		System.out.print("lista na ordem reversa:");
		for(int c=9; c >= 0; c--) {
			
			System.out.print(lista[c] + " / ");
		}
		}
		



	}


