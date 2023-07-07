package com.exe;

public class Logicos {

	public static void main(String[] args) {

		/* desafio do professor da udemy */
	 
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		// Só comprará a Tv de 50 se os dois trabalhos forem verdadeiro.
		boolean televisao50 = trabalho1 && trabalho2;
		
		// Só comprara a Tv de 32 se apenas um dos dois trabalhos forem verdadeiros.
		boolean televisao32 = trabalho1 ^ trabalho2;
		
		// Só irão tomar sorvete se um dos dois trabalhos forem verdadeiros.
		boolean tomarSorvete = televisao50 || televisao32;
		
		// Ficarão em casa se os dois trabalhos forem falso.
		boolean ficarEmCasa = !trabalho1 && !trabalho2;
        
		// Só ficarão mais saudável se nao forem tomar sorvete.
		boolean saudavel = !tomarSorvete;
        
        
        System.out.println("Trebalho 1 = " + trabalho1);
        System.out.println("Trebalho 2 = " + trabalho2);
        System.out.println("Televisao de 50 = " + televisao50 );
        System.out.println("Televisao de 32 = " + televisao32 );
        System.out.println("Tomar sorvete = " + tomarSorvete );
        System.out.println("ficar em casa = " + ficarEmCasa );
        System.out.println("saudavel = " + saudavel);
	}

}
