package atividade02;
import java.util.Random ;

public class exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ale= new Random();
		int maior =  0;
		int menor = 0;
		int[] lista = new int[15];
		System.out.print("a lista de numeros é:");

		for(int c=0;c<15;c++) {
			lista[c] = ale.nextInt(1,100);
			System.out.print(lista[c] + " / ");

			if(c == 0 ) {
				maior= menor =  lista[c];
			}else if( lista[c] > maior)  {
				maior = lista[c];
		    	
		    }else if (lista[c] < menor ) {
		    	menor = lista[c];
		    }
			
		}
		
		System.out.println();
		System.out.println("o maior numero é :" + maior );
		System.out.println("o menor numero é :"+ menor );



		

	}

}
