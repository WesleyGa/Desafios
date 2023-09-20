package com.classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("nootbook", 4356.10);
	
	
		
		Produto p2 = new Produto();
		p2.nome = "nootbook";
		p2.preco = 12.50;
		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		double mediaDoCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println("media do carrinho = " + mediaDoCarrinho);
	}

}
