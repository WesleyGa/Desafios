package com.arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas deseja informar?");
		int notas = entrada.nextInt();
		double[] nota = new double[notas];

		for (int i = 0; i < notas; i++) {
			System.out.println("Digite a " + i + "º nota");
			nota[i] = entrada.nextDouble();
		}
		double soma = 0.0;
		for (double nt : nota) {
			soma += nt;
		}
		System.out.println("A media é " + soma / notas);
		entrada.close();
	}
}
