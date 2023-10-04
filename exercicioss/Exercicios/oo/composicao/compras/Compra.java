package oo.composicao.compras;

import java.util.ArrayList;

public class Compra {

	String cliente;
	
	 
	ArrayList<Item> itens = new ArrayList<Item>(); // lista de itens da compra

	
	void adicionarItem(Item item) { // metedo para adiconar os dados na lista.
		this.itens.add(item);
		item.compra = this;
	}

	
	double valorTotal() { // para calcular o preço total de cada compra feita
		double total = 0;

		for (Item item : itens) {

			total += item.preco * item.quantidade;
		}

		return total;
	}

}
