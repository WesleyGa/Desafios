package com.exercicios;

import javax.swing.JOptionPane;

public class Temperatura {

	public static void main(String[] args) {
		final double X = 32;
		final double CEL = 5.0 / 9.0;
		final double FAHR = 9.0 / 5.0;
		final double KEL = 273.15;

		int continuar = 0;
		while (continuar == 0) {
			String opcao = JOptionPane.showInputDialog(null, "Digite 1: Converter fahrenheit para celsius \n"
					+ "Digite 2: Converter celsius para fahrenheit \n" 
					+ "Digite 3: Converter fahrenheit para Kelvin \n"
					+ "Digite 4: Converter celsius para Kelvin \n" 
					+ "Digite 5: Converter Kelvin para celsius \n"
					+ "Digite 6: Converter Kelvin para fahrenheit");

			// Convertendo de fahrenheit para celsius     Formula é (°F − 32) × 5/9 = °C
			if (opcao.equals("1")) {
				String fahr = JOptionPane.showInputDialog("Qual é a temperatura em fahrenheit ");
				double f = Double.valueOf(fahr);
				double c = (f - X) * CEL;
				JOptionPane.showMessageDialog(null, "A temperatura em celsius é " + c + "°C");

			// Convertendo de celsius para fahrenheit     Formula = (°C × 9/5) + 32 = °F
			} else if (opcao.equals("2")) {
				String cels = JOptionPane.showInputDialog("Qual é a temperatura em celsius");
				double c = Double.valueOf(cels);
				double f = (c * FAHR) + X;
				JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit é " + f + "°F");
				
			// Convertendo de fahrenheit para Kelvin      Formula = (°F − 32) × 5/9 + 273.15 = K
			} else if (opcao.equals("3")) {
				String fahr = JOptionPane.showInputDialog("Qual é a temperatura em fahrenheit");
				double f = Double.valueOf(fahr);
				double k = (f - X) * CEL + KEL;
				JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é " + k + "K");
				
			// Convertendo de celsius para Kelvin        Formula = °C + 273.15 = K
			} else if (opcao.equals("4")) {
				String cels = JOptionPane.showInputDialog("Qual é a temperatura em celsius");
				double c = Double.valueOf(cels);
				double k = c + KEL;
				JOptionPane.showMessageDialog(null, "A temperatura em Kelvin é " + k + "K");
				
			// Convertendo de Kelvin para celsius        Formula = K − 273.15 = °C
			} else if (opcao.equals("5")) {
				String kelv = JOptionPane.showInputDialog("Qual é a temperatura em Kelvin");
				double k = Double.valueOf(kelv);
				double c = k - KEL;
				JOptionPane.showMessageDialog(null, "A temperatura em celsius é " + c + "°C");
				
			// Convertendo de Kelvin para fahrenheit      Formula = (K − 273.15) × 9/5 + 32 = °F
			} else if (opcao.equals("6")) {
				String kelv = JOptionPane.showInputDialog("Qual é a temperatura em Kelvin");
				double k = Double.valueOf(kelv);
				double f = (k - KEL) * FAHR + X;
				JOptionPane.showMessageDialog(null, "A temperatura em fahrenheit é " + f + "°F");
				
			} else {
				JOptionPane.showMessageDialog(null, "Por favor insira um número válido");
			}
			
			int cont = JOptionPane.showConfirmDialog(null, "Deseja continuar convertendo?");
			continuar = cont;
		}

	}

}
