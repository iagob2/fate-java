package atividade02;

import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {
        
        Random ale= new Random();
  	int[] dado1 = new int[100] ;
  	int[] dado2 = new int[100] ;
  	int cont = 0 ; 
  	for(int c= 0 ;  c<100 ; c++) {
  		dado1[c] = ale.nextInt(1,6);
  		dado2[c] = ale.nextInt(1,6);
  		
  			if((dado1[c] + dado2[c]) == 7 ) {cont++; }
  	}
  	
    System.out.print("no total foram  " +  cont + " vezes que a somor dos dois dados deu 7");



    }
  }
