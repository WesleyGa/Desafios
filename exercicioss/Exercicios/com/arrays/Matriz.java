package com.arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual a quantidade de alunos?");
		int qtdAlunos = entrada.nextInt();

		System.out.print("Qual a quantidade de notas para cada aluno?");
		int qtdNotas = entrada.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		double total = 0.0;
		for (int i = 0; i < notasDaTurma.length; i++) {

			for (int j = 0 ; j < notasDaTurma[i].length; j++) {

				System.out.printf("Infomre a nota " + (j + 1) +" do aluno " +  (i + 1));
				notasDaTurma[i][j] = entrada.nextDouble();
				total += notasDaTurma[i][j];

			}

		}
		double media = total/(qtdAlunos * qtdNotas);
		System.out.println("Media da turma é " + media);
		
		entrada.close();
	}

}
