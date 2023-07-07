package com.classe;

public class Jantar {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Wesley", 73.0);
		Comida a = new Comida("Feijao", 0.123);
		Comida b = new Comida("Arroz", 0.304);


		System.out.println("Tenho " + pessoa1.pesoPessoa + " e me chamo " + pessoa1.nomePessoa);
		pessoa1.comer(a);
		System.out.println("Tenho " + pessoa1.pesoPessoa + " e me chamo " + pessoa1.nomePessoa);
		pessoa1.comer(b);
		System.out.println("Tenho " + pessoa1.pesoPessoa + " e me chamo " + pessoa1.nomePessoa);

	}

}
