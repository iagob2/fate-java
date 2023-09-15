package atividade02;
import java.util.Random;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ale= new Random();
		int[] lista = new int[10];
		
		for(int c = 0 ; c <10; c++) {
			lista[c] = ale.nextInt(1,100);
			
			if ( (lista[c]%2) == 0 ) {
				System.out.println( "Número "
			
					+ lista[c] + " é par !"  );
			}}
			
	}}