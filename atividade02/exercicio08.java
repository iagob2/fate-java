package atividade02;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] lista = new int[10];
		
		int cont= 0;
		int fre = 0;
		int maiocont = 0 ;
	    Scanner ler = new Scanner(System.in);
	    
	    for(int c=0 ; c< 10; c++ ) {
		System.out.print("digite um numero: ");
		lista[c] = ler.nextInt();}
	    
	    for(int c = 0 ; c < lista.length; c++) {
	    
	    	for(int j = 0; c< lista.length;j++) {
	    		
	    		if( lista[c] == lista[j] ) { 
	    			
	    			cont++;
	    			}
	    		}
	    	
	    	
	    	if(cont >  maiocont) {
	    		maiocont = cont;
	    		fre = lista[c];}
	    	}
	    
	    
	    System.out.println("o numero com maior fequencia é:" + fre + " e ele aparecer "+ maiocont+"vezes");
	    
	    
	    }
	  }
