package com.estruturaControle;

import java.util.Scanner;

public class WHILE {

	public static void main(String[] args) {

		Scanner entrada1 = new Scanner(System.in);

		String palavraDigitada = "";

		while (palavraDigitada.equals("")) {
			System.out.println("Digite");
			String palavra = entrada1.next();

			if (palavra.equalsIgnoreCase("Sair")) {
				System.out.println("Voce saiu");
				palavraDigitada = "Voce saiu";
			}
		}

		entrada1.close();
	}

}
