package com.estruturaControle;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String texto = "";

		do {

			System.out.println("Digite as palavras magicas");
			texto = entrada.nextLine();

		} while (!texto.equalsIgnoreCase("Por favor"));
	}

}
