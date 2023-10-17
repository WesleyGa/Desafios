package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	Cliente cliente;

	ArrayList<Item> itens = new ArrayList<Item>();
	
	void compra (Produto produto, int qtde) {
		itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}

}
