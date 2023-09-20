package com.estruturaControle;

import java.util.Scanner;

public class switch1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int nota = entrada.nextInt();
		String conceito = "";
		
		switch (nota) {

		case 10 :
			conceito = "A";
		}

	}

}
