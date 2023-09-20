package com.estruturaControle;

public class desafioFor {

	public static void main(String[] args) {

		String valor = "#";
		for (char j = 'a'; j <= 'e'; j++) {
			System.out.println(valor);
			valor += "#";

			for (String i = "#"; !i.equals("######"); i += "#") {
				System.out.println(i);
				
			}
		}
	}
}
