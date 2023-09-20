package com.arrays;

import javax.swing.JOptionPane;

public class Jarrays {
	public static void main(String[] args) {

		String posicoes = JOptionPane.showInputDialog("Quantas posiçoes o Array deve ter?");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for (int pos = 0; pos < notas.length; pos++) {

			String valor = JOptionPane.showInputDialog("Qual a nota do aluno " + (pos + 1));

			double nota = Double.parseDouble(valor);

			notas[pos] = nota;

			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
		}
	}

}
