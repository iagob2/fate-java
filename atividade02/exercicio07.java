package atividade02;

import java.util.Random;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int cout1 = 0 ;
		int cout2 = 0 ;
		int cout3 = 0 ;
		int cout4 = 0 ;
		int cout5 = 0 ;
		int cout6 = 0 ;
		int cout7 = 0 ;
		int cout8 = 0 ;
		int cout9 = 0 ;
		int cout10 = 0 ;

		
		Random ale = new Random() ;
		int[] lista = new int [50];
		for ( int c=0 ; c< 50 ; c++) {
			lista[c] = ale.nextInt(1,10);
			switch(lista[c]) {
			case 1 :
				 cout1 += 1 ; 
			     break ; 
			case 2 :
				 cout2 += 1 ; 
			     break ; 
			case 3 :
				 cout3 += 1 ; 
			     break ;
			case 4:
				 cout4 += 1 ; 
			     break ; 
			case 5 :
				 cout5 += 1 ; 
			     break ; 
			case 6 :
				 cout6 += 1 ; 
			     break ; 
			case 7 :
				 cout7 += 1 ; 
			     break ; 
			case 8 :
				 cout8 += 1 ; 
			     break ; 
			case 9 :
				 cout9 += 1 ; 
			     break ;
			case 10 :
				 cout10 += 1 ; 
			     break ; 
			     
			     

			}
			
		}
		for ( int c=0 ; c< 50 ; c++) {
			System.out.print(lista[c]+"/");
		}
		System.out.println();
		
		System.out.println("vezes que os numeros repetiram");
		
	
			System.out.println("1 = " + cout1);
            System.out.println("2 = " + cout2);
            System.out.println("3 = " + cout3);
            System.out.println("4 = " + cout4);
            System.out.println("5 = " + cout5);
            System.out.println("6 = " + cout6);
            System.out.println("7 = " + cout7);
            System.out.println("8 = " + cout8);
            System.out.println("9 = " + cout9);
            System.out.println("10 = " + cout10);
            
		/* respota mais facio
		 * int qtdes[] = new int[10];
	int values[] = new int[]{1,1,1,2,2,9};
	
	for(int i : values){ qtdes[i]++; }
	for(int i = 0; i < qtdes.length; i++){ 
	  if(qtdes[i] > 0) System.out.println(i + " aparece " + qtdes[i]);
	}*/
		
	
	
	

	}

}
