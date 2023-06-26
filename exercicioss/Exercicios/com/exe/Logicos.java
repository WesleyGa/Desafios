package com.exe;

public class Logicos {

	public static void main(String[] args) {

		boolean trabalho1 = true;
		boolean trabalho2 = false;
		boolean televisao50 = trabalho1 && trabalho2;
		boolean televisao32 = trabalho1 ^ trabalho2;
		boolean tomarSorvete = televisao50 || televisao32;
        boolean ficarEmCasa = !trabalho1 && !trabalho2;
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
