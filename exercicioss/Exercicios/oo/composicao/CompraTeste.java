package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Joao Pedro";
		compra1.itens.add(new Item("Caneta", 10, 1.50));
		compra1.itens.add(new Item("Borracha", 3, 7.10));
		compra1.itens.add(new Item("Caderno", 8, 3.55));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal() );
	}

}
