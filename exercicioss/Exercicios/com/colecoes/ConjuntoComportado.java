package com.colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {

//		Set <String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("ana");
		lista.add("Carlos");
		lista.add("Lucas ");
		lista.add("pedro");

		for (String candidato : lista) {
			System.out.println(candidato);

		}
	}

}
