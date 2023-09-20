package com.colecoes;

import java.util.ArrayDeque;
import java.util.Deque;


public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno principe");
		livros.push("Don queixote");
		livros.push("O Hobit");
		
		
		System.out.println(livros.contains("O Pequeno principe"));
		
		int i = livros.size();
		for (int iterator = 0; iterator < i; iterator++) {
			
			System.out.println(livros.remove());
			
		}
		
		 // livros.clear(); limpa a lista
		 // livros.isEmpty; Esta vazia?
	     //livro.contains(); contem algum livro especifico?		
		
		
	}

}
