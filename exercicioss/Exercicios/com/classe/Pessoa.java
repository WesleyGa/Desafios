package com.classe;

public class Pessoa {
	String nomePessoa;
	double pesoPessoa;

	Pessoa(String nome, double peso) {
		nomePessoa = nome;
		pesoPessoa = peso;
	}

	void comer(Comida comida) {
		if (comida != null) {
			pesoPessoa += comida.pesoComida;
		}
	}
}
