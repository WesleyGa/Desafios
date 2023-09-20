package com.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		fila.offer("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Wesley");
		fila.add("Mariana");
		fila.offer("Gui");

		System.out.println(fila.size());

		int quantidade = 6;
		for (int a = 0; a < quantidade; a++) {

			String teste = fila.element();

			System.out.println(teste);
			

		}
		System.out.println("---------------------------");
		int quantidad = 6;
		for (int a = 0; a < quantidad; a++) {

			String teste = fila.poll();
			System.out.println(teste);
			

		}

	}
}
