package com.estruturaControle;

import java.util.Scanner;

public class desafioWhile {

	public static void main(String[] args) {

		double total = 0.0;
		int alunos = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a nota do aluno:");

		double nota = entrada.nextDouble();
		while (nota <= 10 && nota >= 0) {

			while (nota != -1) {
				total += nota;
				alunos++;
				nota = entrada.nextDouble();

			}
		}
		entrada.close();

		System.out.println("Nota total : " + total);
		System.out.println("Quantidade de alunos : " + alunos);
	}
}
